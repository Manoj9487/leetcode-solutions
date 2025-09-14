class Solution:
    def maxKDistinct(self, nums: List[int], k: int) -> List[int]:
        l1 = list(set(nums))
        l1.sort(reverse = True)
        l2 = []
        count = 0
        for i in l1 :
            if count == k :
                break
            else :
                l2.append(i)
                count += 1
        return l2
