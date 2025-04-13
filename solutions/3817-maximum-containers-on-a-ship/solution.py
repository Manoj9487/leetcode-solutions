class Solution:
    def maxContainers(self, n: int, w: int, maxWeight: int) -> int:
        containers = maxWeight // w
        if n * n >= containers :
            return containers
        else :
            return n * n
