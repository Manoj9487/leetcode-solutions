class Solution:
    def judgeCircle(self, moves: str) -> bool:
        l, r, u, d = 0, 0, 0, 0
        for i in moves :
            if i == "R" :
                r += 1
            elif i == "L" :
                l += 1
            elif i == "U" :
                u += 1
            else :
                d += 1

        if r == l and d == u :
            return True
        
        return False


