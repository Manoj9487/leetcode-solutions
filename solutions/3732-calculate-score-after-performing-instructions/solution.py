class Solution:
    def calculateScore(self, instructions: List[str], values: List[int]) -> int:
        index = set()
        n = len(instructions)
        score = 0
        i = 0
        
        while 0 <= i < n and i not in index :
            index.add(i)
            if instructions[i] == "add" :
                score += values[i]
                i += 1
            else :
                i += values[i]
            
        return score
