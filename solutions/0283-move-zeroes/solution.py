
class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l = 0
    
        while(l < len(nums)) :
            if (nums[l] == 0) :
                nums.remove(nums[l])
                nums.append(0)
            l += 1
        
        return nums
