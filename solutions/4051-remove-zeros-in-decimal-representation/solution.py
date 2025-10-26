class Solution:
    def removeZeros(self, n: int) -> int:
        s = str(n)
        return int(s.replace('0', ''))
