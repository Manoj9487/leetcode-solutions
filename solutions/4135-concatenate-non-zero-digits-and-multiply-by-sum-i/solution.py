class Solution:
    def sumAndMultiply(self, n: int) -> int:
        if (n == 0) :
            return 0
        s = str(n)
        s = s.replace("0", "")
        l = [int(i) for i in s]
        
        return int(s) * sum(l)
