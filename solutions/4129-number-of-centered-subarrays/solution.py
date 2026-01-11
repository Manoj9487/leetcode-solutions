class Solution:
    def centeredSubarrays(self, nums: List[int]) -> int:
        c = 0
        for l in range(0, len(nums)) :
            for r in range(l, len(nums)) :
                sub = nums[l:r + 1]
                if (sum(sub) in sub) :
                    c += 1
        return c
