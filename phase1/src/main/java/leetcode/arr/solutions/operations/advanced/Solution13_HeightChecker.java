package leetcode.arr.solutions.operations.advanced;

public class Solution13_HeightChecker {

    /**
     *
     * Input: heights = [1,1,4,2,1,3]
     * Output: 3
     * Explanation:
     * heights:  [1,1,4,2,1,3]
     * expected: [1,1,1,2,3,4]
     * Indices 2, 4, and 5 do not match.
     *
     * Input: heights = [5,1,2,3,4]
     * Output: 5
     * Explanation:
     * heights:  [5,1,2,3,4]
     * expected: [1,2,3,4,5]
     * All indices do not match.
     *
     *
     * Input: heights = [1,2,3,4,5]
     * Output: 0
     * Explanation:
     * heights:  [1,2,3,4,5]
     * expected: [1,2,3,4,5]
     * All indices match.
     *
     *
     */

    public int heightChecker(int[] heights) {

        int[] expected = new int[heights.length];
        for(int i=0; i < expected.length; i++){
            expected[i] = heights[i];
        }


        int count = 0;
        //sort expected array
        for(int i=0; i < expected.length; i++){

            for(int j = i+1; j < expected.length; j++){
                if (expected[i] >= expected[j]) {
                    expected[i] += expected[j];
                    expected[j] = expected[i] - expected[j];
                    expected[i] = expected[i] - expected[j];
                }
            }

            //System.out.println("Expected - " + expected[i] + " Height - " + heights[i]);
            if(expected[i] != heights[i]) count++;

        }

        return count;

    }
}
