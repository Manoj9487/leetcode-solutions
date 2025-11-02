class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        m = min(nums)
        n = max(nums)
        l1 = []
        for i in range(m, n) :
            if i not in nums :
                l1.append(i)
        return l1
