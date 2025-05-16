class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        l2 = []
        for i in candies :
            if i + extraCandies >= max(candies) :
                l2.append(True)
            else :
                l2.append(False)
        return l2
