class Solution:
    def minPartitions(self, n: str) -> int:
        s = '9876543210'
        s1 = str(n)
        for i in s :
            if i in s1 :
                return int(i)
