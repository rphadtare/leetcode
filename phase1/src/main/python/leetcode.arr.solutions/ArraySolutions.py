class Solution:
    @staticmethod
    def findMaxConsecutiveOnes(nums: list[int]) -> int:
        """To find maximum consecutive ones in binary number"""
        max_consecutive_one_values = 0
        tmp_max_consecutive_one_values = 0

        for i in range(0, len(nums)):

            if nums[i] == 1:
                tmp_max_consecutive_one_values += 1

            if nums[i] != 1 or i == len(nums) - 1:
                max_consecutive_one_values = max(max_consecutive_one_values, tmp_max_consecutive_one_values)
                tmp_max_consecutive_one_values = 0

        return max_consecutive_one_values
