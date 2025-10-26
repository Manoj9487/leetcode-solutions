class Solution:
    def maxAlternatingSum(self, nums: List[int]) -> int:
        n = len(nums)
        nums1 = [abs(number) for number in nums ]
        nums1.sort(reverse = True)
        add = (n + 1) / 2
        ans = 0
        c = 1
        for i in nums1 :
            if add >= c :
                ans += i * i
                c += 1
            else :
                ans -= i * i
        return ans
            
