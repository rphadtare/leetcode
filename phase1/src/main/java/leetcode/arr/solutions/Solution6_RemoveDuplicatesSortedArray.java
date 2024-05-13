package leetcode.arr.solutions;

public class Solution6_RemoveDuplicatesSortedArray {

    /**
     *
     * Input: nums = [1,1,2]
     * Output: 2, nums = [1,2,_]
     * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     *
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     */

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < len; i++){
            int cnt = 0, pos = i;
            boolean flag = true;

            while(flag && pos+1 < nums.length){
                if(nums[i] == nums[pos+1]){
                    cnt++;
                    len--;
                    pos++;
                } else {
                    flag = false;
                }
            }

            if(cnt > 0){
                for(int j=(i+1); j < len; j++){
                    nums[j] = nums[j+cnt];
                    nums[j+cnt] = nums[j+cnt] - 10;
                }
            }

        }

        return len;

    }

    //Better solution compared to previous in memory
    public int removeDuplicates(int[] nums, int dummy) {
        int len = nums.length;
        for(int i = 0; i < len; i++){
            int cnt = 1;
            boolean flag = true;

            while(flag && i+cnt < nums.length){
                if(nums[i] == nums[i+cnt]){
                    cnt++;
                    len--;
                } else {
                    flag = false;
                }
            }

            if(cnt > 1){
                for(int j=(i+1); j < len; j++){
                    nums[j] = nums[j+cnt-1];
                    nums[j+cnt-1] = nums[j+cnt-1] - 10;
                }
            }

        }

        return len;

    }

}
