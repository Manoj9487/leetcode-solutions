class Solution:
    def arraySign(self, nums: List[int]) -> int:
        negative = 0
        for i in nums :
            if i == 0 :
                return 0
            elif i  < 0 :
                negative += 1
        if negative % 2 == 0 :
            return 1
        else :
            return -1
        
