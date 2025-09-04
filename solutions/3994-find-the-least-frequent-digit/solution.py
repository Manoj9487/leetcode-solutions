class Solution:
    def getLeastFrequentDigit(self, n: int) -> int:
        s = str(n)
        small = int(max(s))
        count = len(s)

        for i in s :
            temp = s.count(i)
            if temp < count or (temp == count and int(i) < small ) :
                count = temp
                small = int(i)
        return small
