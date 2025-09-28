class Solution:
    def decimalRepresentation(self, n: int) -> List[int]:
        res = []
        s = str(n)
        l = len(s)
        for i, digit in enumerate(s) :
            if digit != '0' :
                value = int(digit) * 10 ** (l - i - 1)
                res.append(value)
        return res    


