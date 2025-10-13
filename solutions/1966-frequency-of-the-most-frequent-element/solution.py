class Solution:
    def maxFrequency(self, nums, k: int) -> int:
        nums.sort()
        total = 0
        left = 0
        res = 0

        for right in range(len(nums)):
            total += nums[right]

            while nums[right] * (right - left + 1) > total + k:
                total -= nums[left]
                left += 1

            res = max(res, right - left + 1)

        return res
