class Solution:
    def rotateElements(self, nums: List[int], k: int) -> List[int]:
        arr = []
        indice = []
        for i in range(len(nums)) :
            if (nums[i] >= 0) :
                arr.append(nums[i])
                indice.append(i)
                
        if (len(arr)) == 0 :
            return nums
        else :
            k = k % len(arr)
            
        arr[:k] = reversed(arr[:k])
        arr[k:] = reversed(arr[k:])
        arr[:] = reversed(arr)

        for i in range(len(arr)) :
            nums[indice[i]] = arr[i]
            
        return nums

        
