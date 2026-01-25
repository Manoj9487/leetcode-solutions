class Solution:
    def minimumPrefixLength(self, nums: List[int]) -> int:
        c = 0
        for i in range(1, len(nums)) :
            if ((nums[i] <= nums[i - 1])) :
                c = i
                
        return c
            
