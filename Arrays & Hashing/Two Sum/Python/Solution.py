from typing import List

class Solution:
    def __init__(self, nums: List[int], target: int) -> None:
        self.nums = nums
        self.target = target

    def twoSum(self) -> List[int]:
        prevMap = {}
        for i in range(len(self.nums)):
            num = self.nums[i]
            diff = self.target - num
            if diff in prevMap:
                return [prevMap[diff],i]
            prevMap[num] = i
        return []
