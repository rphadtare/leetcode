package leetcode.arr.solutions;

public class FindConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int maxConsecutiveValue = 0;
        int tmpCntOfConsecutiveValue = 0;

        for(int i=0; i<nums.length; i++){

            if(nums[i] == 1){
                tmpCntOfConsecutiveValue++;
            }

            if(nums[i] != 1 || i == nums.length-1){

                if(maxConsecutiveValue < tmpCntOfConsecutiveValue){
                    maxConsecutiveValue = tmpCntOfConsecutiveValue;
                }
                tmpCntOfConsecutiveValue = 0;
            }

        }

        return maxConsecutiveValue;
    }

}
