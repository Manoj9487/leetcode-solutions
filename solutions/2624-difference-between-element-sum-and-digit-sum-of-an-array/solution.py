class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:

        digit_sum = sum(map(int,"".join(map(str, nums))))

        return abs(sum(nums) - digit_sum)


        
