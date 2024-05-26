package leetcode.arr.solutions.operations.advanced;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution15_FindDisappearedNums {

    /**
     *
     *
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [5,6]
     *
     *
     *
     * Input: nums = [1,1]
     * Output: [2]
     *
     *
     *
     */



    // Not a good solution for o(n)
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            set.add(i+1);
        }

        for(int num: nums){
            if(set.contains(num)){
                set.remove(num);
            }
        }

        return new ArrayList<Integer>(set);
    }

    // Good solution from time & space complexity
    public List<Integer> findDisappearedNumbers(int[] nums, int dummy) {
        // 4,3,2,7,8,2,3,1
        int i = 0;
        while(i < nums.length){

            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int tmp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = tmp;
            } else {
                i++;
            }

        }

        List<Integer> answer = new ArrayList<Integer>();

        for(i=0; i < nums.length; i++){
            if(nums[i] != i+1) answer.add(i+1);
        }


        return answer;

    }


}
