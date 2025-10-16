class Solution:
    def countKDifference(self, nums: List[int], k: int) -> int:
        mp = Counter(nums)
        ans = 0
        for num in mp:
            if num + k in mp:
                ans += mp[num] * mp[num + k]
        return ans

        
