class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        minimum = min(len(word1), len(word2))
        s = ""
        for i in range(0, minimum) :
            s += word1[i]
            s += word2[i]
        if (len(word1) < len(word2)) :
            s += word2[minimum::]
        else :
            s += word1[minimum::]
        return s
