class Solution:
    def findIntersectionValues(self, nums1: List[int], nums2: List[int]) -> List[int]:
        ans1, ans2 = 0, 0
        set1, set2 = set(nums1), set(nums2)

        for num in nums1 :
            if num in set2 :
                ans1 += 1
        for num in nums2 :
            if num in set1 :
                ans2 += 1
        return [ans1, ans2]
