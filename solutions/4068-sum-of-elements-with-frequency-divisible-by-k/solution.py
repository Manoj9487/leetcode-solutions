from collections import Counter
class Solution:
    def sumDivisibleByK(self, nums: List[int], k: int) -> int:
        l1 = Counter(nums)
        sum1 = 0
        
        for i, j in l1.items() :
            if j % k == 0 :
                sum1 += i * j
        return sum1
        
        
        
