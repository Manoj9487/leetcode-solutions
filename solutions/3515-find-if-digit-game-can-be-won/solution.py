class Solution:
    def canAliceWin(self, nums: List[int]) -> bool:
        s = 0
        d = 0
        for i in nums:
            if len(str(i)) == 1:
                s += i
            else:
                d += i
        return True if s != d else False
        
