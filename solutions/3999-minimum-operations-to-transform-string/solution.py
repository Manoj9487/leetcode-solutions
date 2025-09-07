class Solution:
    def minOperations(self, s: str) -> int:
        count = 0
        for i in s :
            if i != 'a' :
                steps = (ord('a') - ord(i)) % 26
                count = max(count, steps)
        return count
