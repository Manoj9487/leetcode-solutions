class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        l = list(s.split(" "))
        return " ".join(l[:k])
