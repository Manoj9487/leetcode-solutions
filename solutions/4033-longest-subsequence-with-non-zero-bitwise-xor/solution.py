class Solution:
    def longestSubsequence(self, nums: List[int]) -> int:
        arr = nums 
        sum1 = 0
        for num in nums:
            sum1 ^= num

        if sum1 != 0:
            return len(nums)
        elif any(num != 0 for num in nums):
            return len(nums) - 1
        else:
            return 0

        
        
        
