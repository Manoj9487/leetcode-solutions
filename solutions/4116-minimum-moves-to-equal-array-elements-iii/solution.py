class Solution:
    def minMoves(self, nums: List[int]) -> int:
        max_ele = max(nums)
        moves = 0
        for i in nums :
            moves += abs(max_ele - i)
        return moves
            
