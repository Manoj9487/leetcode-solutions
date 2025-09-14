class Solution:
    def earliestTime(self, tasks: List[List[int]]) -> int:
        time_req = [s + t for s , t in tasks]
        return min(time_req)
