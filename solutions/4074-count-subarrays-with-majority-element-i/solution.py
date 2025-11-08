class Solution:
    def countMajoritySubarrays(self, nums: List[int], target: int) -> int:
        n = len(nums)
        count = 0
        for i in range(n) :
            appears = 0
            for j in range(i, n) :
                if (nums[j] == target) :
                    appears += 1
                subarray = j - i + 1
                if (subarray / 2 < appears) :
                    count += 1
        return count
