class Solution:
    def canMakeArithmeticProgression(self, arr: List[int]) -> bool:
        arr.sort()
        flag = True
        cd = arr[1] - arr[0]
        for i in range(0, len(arr) - 1) :
            if (arr[i + 1] - arr[i]) != cd :
                flag = False
                break
        return flag
