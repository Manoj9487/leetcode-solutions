class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        nums = [abs(i) for i in nums]
        m = max(nums)
        nums.remove(m)
        n = max(nums)
        return (100000 * m * n)
