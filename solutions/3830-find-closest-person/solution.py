class Solution:
    def findClosest(self, x: int, y: int, z: int) -> int:
        x_pos = abs(x - z)
        y_pos = abs(y - z)
        if x_pos < y_pos :
            return 1
        elif x_pos > y_pos :
            return 2
        else :
            return 0
