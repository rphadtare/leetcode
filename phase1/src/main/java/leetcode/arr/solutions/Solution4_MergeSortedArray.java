package leetcode.arr.solutions;

public class Solution4_MergeSortedArray {

    /**
     *
     * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * Output: [1,2,2,3,5,6]
     * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
     * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
     *
     * Input: nums1 = [1], m = 1, nums2 = [], n = 0
     * Output: [1]
     * Explanation: The arrays we are merging are [1] and [].
     * The result of the merge is [1].
     *
     * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
     * Output: [1]
     * Explanation: The arrays we are merging are [] and [1].
     * The result of the merge is [1].
     * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
     *
     */


    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(n != 0){
            int m_cnt = 0, n_cnt = 0, cnt = 0;
            int[] result = new int[m+n];

            for(int i=0; i < m+n; i++){

                if(n_cnt < n){
                    if(nums1[m_cnt] > nums2[n_cnt]){
                        result[i] = nums2[n_cnt];
                        n_cnt++;
                    } else if (nums1[m_cnt] == 0 && m_cnt >= m) {
                        result[i] = nums2[n_cnt];
                        n_cnt++;
                    } else {
                        result[i] = nums1[m_cnt];
                        m_cnt++;
                    }
                } else {
                    result[i] = nums1[m_cnt];
                    m_cnt++;
                }

            }

            if (m + n >= 0) System.arraycopy(result, 0, nums1, 0, m + n);

        }

    }

}
