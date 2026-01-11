
class Solution:
    def residuePrefixes(self, s: str) -> int:
        sn = [False] * 26
        dis = 0
        ans = 0

        for i, ch in enumerate(s):
            idx = ord(ch) - ord('a')
            if not sn[idx]:
                sn[idx] = True
                dis += 1

            mod = (i + 1) % 3
            if dis == mod:
                ans += 1

        return ans

