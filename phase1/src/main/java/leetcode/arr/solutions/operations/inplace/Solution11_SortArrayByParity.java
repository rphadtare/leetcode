package leetcode.arr.solutions.operations.inplace;

public class Solution11_SortArrayByParity {

    /**
     *
     * Input: nums = [3,1,2,4]
     * Output: [2,4,3,1]
     * Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
     *
     *
     * Input: nums = [0]
     * Output: [0]
     *
     */

    public int[] sortArrayByParity(int[] nums) {

        for(int i=0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                int j = 1;
                while(i + j < nums.length){
                    if(nums[i + j] % 2 == 0){
                        nums[i+j] += nums[i];
                        nums[i] = nums[i + j] - nums[i];
                        nums[i + j] = nums[i + j] - nums[i];
                        break;
                    }
                    j++;
                }
            }
        }

        return nums;

    }

}
