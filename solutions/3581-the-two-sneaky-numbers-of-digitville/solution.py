class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        l = [j for j in set(nums) if nums.count(j) == 2]
        return l
