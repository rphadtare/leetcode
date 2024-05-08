package leetcode.arr.solutions;
import java.lang.Math;

/**
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore, only 12 and 7896 contain an even number of digits.
 *
 * Input: nums = [555,901,482,1771]
 * Output: 1
 * Explanation:
 * Only 1771 contains an even number of digits.
 */

public class Solution2 {
    public static int findNumbersWithEvenNumberOfDigits(int[] nums){
        String num_to_str = "";
        int cnt_of_even_num_of_digits = 0;

        for(int num: nums){
            num_to_str = String.valueOf(num);
            if(num_to_str.length() % 2 == 0){
                cnt_of_even_num_of_digits ++;
            }
        }

        return cnt_of_even_num_of_digits;
    }

    public int findNumbers(int[] nums) {

        int cnt_of_even_num_of_digits = 0;
        for(int num: nums){
            int power = 1;
            while(power <= 5){

                if(num <= Math.pow(10, power)){

                    if(num < Math.pow(10, power) && (power % 2 == 0)){
                        cnt_of_even_num_of_digits++;
                    }

                    if(num == Math.pow(10, power) && (power % 2 != 0)){
                        cnt_of_even_num_of_digits++;
                    }

                    break;
                }
                power++;
            }
        }

        return cnt_of_even_num_of_digits;

    }

    //best solution so far
    public int findNumbers(int[] nums, int dummy) {

        int cnt_of_even_num_of_digits = 0;
        for(int num: nums){
            int reminder = num;
            int tmp_count = 0;
            while(reminder > 0){
                reminder = reminder/10;
                tmp_count++;
            }

            if(tmp_count % 2 == 0){
                cnt_of_even_num_of_digits++;
            }
        }

        return cnt_of_even_num_of_digits;

    }


}
