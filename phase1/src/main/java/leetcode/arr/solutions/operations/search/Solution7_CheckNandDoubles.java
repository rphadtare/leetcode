package leetcode.arr.solutions.operations.search;

public class Solution7_CheckNandDoubles {

    /**
     * Input: arr = [10,2,5,3]
     * Output: true
     * Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
     *
     * Input: arr = [3,1,7,11]
     * Output: false
     * Explanation: There is no i and j that satisfy the conditions.
     *
     */

    class Solution {
        //10,2,5,3
        public boolean checkIfExist(int[] arr) {

            boolean  result = false;

            for(int i=0;i<arr.length;i++){

                for(int j=0; j<arr.length; j++){

                    //i and j should not be same
                    if(i != j){

                        if(arr[i] == arr[j] * 2){
                            result = true;
                            break;
                        }

                    }

                }

                if(result){
                    break;
                }
            }

            return result;

        }
    }
}
