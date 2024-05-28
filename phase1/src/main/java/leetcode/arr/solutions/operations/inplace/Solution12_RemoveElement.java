package leetcode.arr.solutions.operations.inplace;

public class Solution12_RemoveElement {

    /**
     *
     * Input: nums = [3,2,2,3], val = 3
     * Output: 2, nums = [2,2,_,_]
     * Explanation: Your function should return k = 2, with the first two elements of nums being 2.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     *
     *Input: nums = [0,1,2,2,3,0,4,2], val = 2
     * Output: 5, nums = [0,1,4,0,3,_,_,_]
     * Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
     * Note that the five elements can be returned in any order.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     *
     *
     */

    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int write_pointer = len - 1;
        for(int read_pointer=0;read_pointer < len; read_pointer++){

            if(nums[write_pointer] == val){
                read_pointer--;
                write_pointer--;
                len--;
            } else if(nums[read_pointer] == val){
                nums[write_pointer] += nums[read_pointer];
                nums[read_pointer] = nums[write_pointer] - nums[read_pointer];
                nums[write_pointer] -= nums[read_pointer];
                write_pointer--;
                len--;
            }

        }

        return len;
    }

    //best solution so far ...
    public int removeElement(int[] nums, int val, int dummy) {
        int write_pointer = 0;
        for(int read_pointer=0; read_pointer < nums.length; read_pointer++){

            if(nums[read_pointer] != val){
                nums[write_pointer] = nums[read_pointer];
                write_pointer++;
            }

        }

        return write_pointer;
    }

}
