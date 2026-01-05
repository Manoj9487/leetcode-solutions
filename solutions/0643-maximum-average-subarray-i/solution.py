class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        sum1 = sum(nums[:k])
        l = 0
        r = k - 1
        n = len(nums)
        max_sum = sum1
        while(r < n - 1) :
            sum1 -= nums[l]
            l += 1
            r += 1
            sum1 += nums[r]
            max_sum = max(sum1, max_sum)
        return float(max_sum / k)
