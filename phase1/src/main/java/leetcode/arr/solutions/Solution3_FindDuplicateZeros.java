package leetcode.arr.solutions;

public class Solution3_FindDuplicateZeros {

    /**
     * Input: arr = [1,0,2,3,0,4,5,0]
     * Output: [1,0,0,2,3,0,0,4]
     * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
     *
     *
     * Input: arr = [1,2,3]
     * Output: [1,2,3]
     * Explanation: After calling your function, the input array is modified to: [1,2,3]
     */

    public void duplicateZeros(int[] arr) {

        for(int i=0; i < arr.length; i++){

            //If element is 0
            if(arr[i] == 0){

                for(int j=arr.length-1;j > i; j--){
                    arr[j] = arr[j-1];
                }

                i++;
            }

        }

    }

}
