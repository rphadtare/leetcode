
###
#
# Input: nums = [3,2,2,3], val = 3
# Output: 2, nums = [2,2,_,_]
# Explanation: Your function should return k = 2, with the first two elements of nums being 2.
# It does not matter what you leave beyond the returned k (hence they are underscores).
#
# Input: nums = [0,1,2,2,3,0,4,2], val = 2
# Output: 5, nums = [0,1,4,0,3,_,_,_]
# Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
# Note that the five elements can be returned in any order.
# It does not matter what you leave beyond the returned k (hence they are underscores).
# #

def removeElement(nums: list[int], val: int) -> int:
    write_pointer = 0
    for read_val in nums:
        if read_val != val:
            nums[write_pointer] = read_val
            write_pointer += 1

    return write_pointer


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



