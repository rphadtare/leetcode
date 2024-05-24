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


###
# Input: heights = [1,1,4,2,1,3]
# Output: 3
# Explanation:
# heights:  [1,1,4,2,1,3]
# expected: [1,1,1,2,3,4]
# Indices 2, 4, and 5 do not match.
#
# Input: heights = [5,1,2,3,4]
# Output: 5
# Explanation:
# heights:  [5,1,2,3,4]
# expected: [1,2,3,4,5]
# All indices do not match.
#
#
# Input: heights = [1,2,3,4,5]
# Output: 0
# Explanation:
# heights:  [1,2,3,4,5]
# expected: [1,2,3,4,5]
# All indices match.
##

def heightChecker(self, heights: list[int]) -> int:
    expected = heights[0:]
    count = 0
    for i in range(0, len(expected)):

        for j in range(i + 1, len(expected)):
            if expected[i] >= expected[j]:
                expected[i] += expected[j]
                expected[j] = expected[i] - expected[j]
                expected[i] = expected[i] - expected[j]

        if expected[i] != heights[i]:
            count += 1

    return count


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


##
#
# /***
#      *
#      * Input: nums = [3,2,1]
#      * Output: 1
#      * Explanation:
#      * The first distinct maximum is 3.
#      * The second distinct maximum is 2.
#      * The third distinct maximum is 1.
#      *
#      *
#      * Input: nums = [1,2]
#      * Output: 2
#      * Explanation:
#      * The first distinct maximum is 2.
#      * The second distinct maximum is 1.
#      * The third distinct maximum does not exist, so the maximum (2) is returned instead.
#      *
#      *
#      * Input: nums = [2,2,3,1]
#      * Output: 1
#      * Explanation:
#      * The first distinct maximum is 3.
#      * The second distinct maximum is 2 (both 2's are counted together since they have the same value).
#      * The third distinct maximum is 1.
#      *
# #


def thirdMax(self, nums: list[int]) -> int:
    max_val = second_max_val = third_max_val = None
    len_of_nums = len(nums)
    for num in nums:

        if max_val == num or second_max_val == num or third_max_val == num:
            continue

        if max_val is None or max_val < num:
            if max_val is None:
                max_val = num
            else:
                third_max_val = second_max_val
                second_max_val = max_val
                max_val = num
        elif second_max_val is None or second_max_val < num:
            if second_max_val is None:
                second_max_val = num
            else:
                third_max_val = second_max_val
                second_max_val = num
        elif third_max_val is None or third_max_val < num:
            third_max_val = num

    if third_max_val is None:
        return max_val
    else:
        return third_max_val
