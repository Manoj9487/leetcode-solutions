class Solution:
    def lexSmallest(self, s: str) -> str:
        n = len(s)
        s1 = s
        for k in range(1, n + 1) :
            s2 = s[:k][::-1] + s[k:]
            s3 = s[:n-k] + s[n-k:][::-1]
            s1 = min(s1, s2, s3)
        return s1


