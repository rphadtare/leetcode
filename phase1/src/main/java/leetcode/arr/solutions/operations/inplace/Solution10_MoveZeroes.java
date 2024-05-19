package leetcode.arr.solutions.operations.inplace;

public class Solution10_MoveZeroes {


    /**
     *
     * Input: nums = [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     *
     * Input: nums = [0]
     * Output: [0]
     *
     */

    public void moveZeroes(int[] nums) {

        if(!(nums == null || nums.length == 0 || nums.length == 1)){
            // int length = nums.length;
            for(int i=0; i < nums.length; i++){
                int non_zero_index = i + 1;
                if(nums[i] == 0){
                    while(non_zero_index < nums.length && nums[non_zero_index] == 0){
                        non_zero_index ++;
                    }

                    if(non_zero_index < nums.length && non_zero_index > i) {
                        nums[i] = nums[non_zero_index];
                        nums[non_zero_index] = 0;
                    }
                }
            }
        }
    }

}
