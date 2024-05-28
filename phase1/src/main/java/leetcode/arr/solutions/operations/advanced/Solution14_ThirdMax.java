package leetcode.arr.solutions.operations.advanced;

public class Solution14_ThirdMax {

    /***
     *
     * Input: nums = [3,2,1]
     * Output: 1
     * Explanation:
     * The first distinct maximum is 3.
     * The second distinct maximum is 2.
     * The third distinct maximum is 1.
     *
     *
     * Input: nums = [1,2]
     * Output: 2
     * Explanation:
     * The first distinct maximum is 2.
     * The second distinct maximum is 1.
     * The third distinct maximum does not exist, so the maximum (2) is returned instead.
     *
     *
     * Input: nums = [2,2,3,1]
     * Output: 1
     * Explanation:
     * The first distinct maximum is 3.
     * The second distinct maximum is 2 (both 2's are counted together since they have the same value).
     * The third distinct maximum is 1.
     *
     *
     *
     */

    //not good approach
    public int thirdMax(int[] nums) {
        int len = nums.length;
        for(int i=0; i < len; i++){
            for(int j=i+1;j<len;j++){
                if(nums[i] < nums[j]){
                    nums[i] += nums[j];
                    nums[j] = nums[i] - nums[j];
                    nums[i] -= nums[j];
                }

                if(nums[i] == nums[j]){
                    nums[j] += nums[len-1];
                    nums[len-1] = nums[j] - nums[len-1];
                    nums[j] -= nums[len-1];
                    len--;
                    j--;
                }
            }
        }

        if(len >= 3){
            return nums[2];
        } else {
            return nums[0];
        }
    }

    //better solution in terms of runtime && memory distribution
    public int thirdMax(int[] nums, int dummy) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;
        int len = nums.length;
        boolean flag = true;

        for(int num: nums){

            if(num == Integer.MIN_VALUE) flag = false;

            if(max == num || secondMax == num || thirdMax == num){
                len--;
                continue;
            }

            if(max < num){
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if(secondMax < num) {
                thirdMax = secondMax;
                secondMax = num;
            } else if(thirdMax < num) {
                thirdMax = num;
            }
        }

        System.out.println(max + " " + secondMax + " " + thirdMax + " " + len);

        if( (thirdMax == Integer.MIN_VALUE && flag) || (secondMax == thirdMax) ) {
            return max;
        } else {
            return thirdMax;
        }
    }




}
