package leetcode.arr.solutions;

public class Solution8_ValidMountainArray {

    /**
     *
     * Input: arr = [2,1]
     * Output: false
     *
     * Input: arr = [3,5,5]
     * Output: false
     *
     * Input: arr = [0,3,2,1]
     * Output: true
     *
     * * */

    public boolean validMountainArray(int[] arr) {

        //0,1,2,3,1
        if(arr.length > 2){
            boolean peak_reached = false, result = true;
            for(int i=1; i < arr.length; i++){

                //check strictly increasing or decreasing
                if(arr[i] == arr[i-1]){
                    result = false;
                    break;
                } else if(!peak_reached){
                    //check strictly incresing logic
                    if(arr[i] < arr[i-1]){
                        peak_reached = true;
                        if(i == 1){
                            result = false;
                            break;
                        }
                    }

                } else {
                    //check strictly decreasing logic
                    if(arr[i] > arr[i-1]){
                        result = false;
                        break;
                    }
                }

            }

            if(peak_reached && result){
                return true;
            } else {
                return false;
            }


        } else {
            return false;
        }

    }

}
