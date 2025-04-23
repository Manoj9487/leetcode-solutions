class Solution:
    def countDigits(self, num: int) -> int:
        s = str(num)
        count = 0
        for i in s :
            if num % int(i) == 0 :
                count += 1
        return count
