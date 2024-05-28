package leetcode.arr.solutions.operations.advanced;

public class Solution16_SortedSquares {
    /**
     *
     * Input: nums = [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * Input: nums = [-7,-3,2,3,11]
     * Output: [4,9,9,49,121]
     *
     */

    public int[] sortedSquares(int[] nums) {

        int [] squaresOfNumbers = new int[nums.length];
        int leftIndex = 0, rightIndex = nums.length - 1, pos = nums.length - 1;

        //-4, -1, 0, 3, 10
        while(leftIndex <= rightIndex){
            if(Math.abs(nums[leftIndex]) > Math.abs(nums[rightIndex])){
                squaresOfNumbers[pos] = Math.abs(nums[leftIndex]) * Math.abs(nums[leftIndex]);
                leftIndex ++;
            } else {
                squaresOfNumbers[pos] = Math.abs(nums[rightIndex]) * Math.abs(nums[rightIndex]);
                rightIndex --;
            }
            pos--;
        }

        return squaresOfNumbers;
    }

}
