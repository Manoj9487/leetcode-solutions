class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        first_value = start + 2 * 0 
        for i in range(1, n):
            first_value ^= start + 2 * i 
        return first_value
        

        
