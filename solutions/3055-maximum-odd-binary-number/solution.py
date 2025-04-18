class Solution:
    def maximumOddBinaryNumber(self, s: str) -> str:
        count1 = 0
        count0 = 0
        for i in s :
            if i == "1" :
                count1 += 1
            else :
                count0 += 1
        max_odd_s = (count1 - 1) * "1" + count0 * "0" + "1"
        return max_odd_s
