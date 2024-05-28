package leetcode.arr.solutions;

public class Solution3 {

    /**
     * Input: nums = [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     *
     * Input: nums = [-7,-3,2,3,11]
     * Output: [4,9,9,49,121]
     *
     */

    public int[] sortedSquares(int[] nums) {

        int [] squaresofNumbers = new int[nums.length];

        //-4, -1, 0, 3, 10
        for(int i=0;i<nums.length;i++){
            squaresofNumbers[i] = Math.abs(nums[i]) * Math.abs(nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            int min = squaresofNumbers[i];

            for(int j=i;j<nums.length;j++){
                if(min > squaresofNumbers[j]){
                    squaresofNumbers[i] = squaresofNumbers[j];
                    squaresofNumbers[j] = min;
                    min = squaresofNumbers[i];
                }
            }

        }


        return squaresofNumbers;
    }
}
