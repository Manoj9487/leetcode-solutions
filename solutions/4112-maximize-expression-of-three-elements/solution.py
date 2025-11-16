class Solution:
    def maximizeExpressionOfThree(self, nums: List[int]) -> int:
        c = max(nums)
        nums.remove(c)
        c += max(nums)
        return c - min(nums)
