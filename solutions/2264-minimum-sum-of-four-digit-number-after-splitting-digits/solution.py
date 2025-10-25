class Solution:
    def minimumSum(self, num: int) -> int:
        num1 = sorted(str(num))
        return int(num1[0]) * 10 + int(num1[1]) * 10 + int(num1[2]) + int(num1[3])
