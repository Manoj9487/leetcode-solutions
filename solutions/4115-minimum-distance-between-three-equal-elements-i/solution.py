class Solution:
    def minimumDistance(self, nums: List[int]) -> int:
        from collections import defaultdict
        
        indices = defaultdict(list)
        minimum = 600
        
        for idx, val in enumerate(nums) :
            indices[val].append(idx)

        for val, idx in indices.items() :
            if (len(idx)) < 3 :
                continue 

            for i in range(len(idx) - 2) :
                i1, i2, i3 = idx[i], idx[i + 1], idx[i+2]

                distance = abs(i1 - i2) + abs(i2 - i3) + abs(i3 - i1)

                if distance < minimum :
                    minimum = distance
        if (minimum != 600) :
            return minimum
        else :
            return -1
