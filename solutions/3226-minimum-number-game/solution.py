class Solution:
    def numberGame(self, nums: List[int]) -> List[int]:
        nums = sorted(nums)
        arr = []
        for i in range(0, len(nums) - 1, 2) :
            arr.append(nums[i + 1])
            arr.append(nums[i])
        return arr
        

