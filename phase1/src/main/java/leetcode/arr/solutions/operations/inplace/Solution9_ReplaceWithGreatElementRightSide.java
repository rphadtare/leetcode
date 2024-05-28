package leetcode.arr.solutions.operations.inplace;

public class Solution9_ReplaceWithGreatElementRightSide {

    /**
     *
     * Input: arr = [17,18,5,4,6,1]
     * Output: [18,6,6,6,1,-1]
     * Explanation:
     * - index 0 --> the greatest element to the right of index 0 is index 1 (18).
     * - index 1 --> the greatest element to the right of index 1 is index 4 (6).
     * - index 2 --> the greatest element to the right of index 2 is index 4 (6).
     * - index 3 --> the greatest element to the right of index 3 is index 4 (6).
     * - index 4 --> the greatest element to the right of index 4 is index 5 (1).
     * - index 5 --> there are no elements to the right of index 5, so we put -1.
     *
     *
     * Input: arr = [400]
     * Output: [-1]
     * Explanation: There are no elements to the right of index 0.
     *
     */

    //17,18,5,4,6,1
    public int[] replaceElements(int[] arr) {

        for(int i=0; i < arr.length; i++){
            if(i == arr.length -1){
                arr[i] = -1;
            } else {
                arr[i] = arr[i+1];
                for(int j=i+1; j < arr.length; j++){
                    if(arr[j] > arr[i]){
                        arr[i] = arr[j];
                    }
                }
            }
        }

        return arr;

    }
}
