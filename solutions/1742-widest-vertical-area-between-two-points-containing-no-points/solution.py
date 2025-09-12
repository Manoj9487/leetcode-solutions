class Solution:
    def maxWidthOfVerticalArea(self, points: List[List[int]]) -> int:
        x_axis = list(set(x for x, _ in points))
        x_axis.sort()

        n, res = len(x_axis), 0
        for i in range(1, n):
            res = max(res, x_axis[i] - x_axis[i - 1])
        return res
