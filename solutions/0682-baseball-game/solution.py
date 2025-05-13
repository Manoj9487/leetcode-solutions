class Solution:
    def calPoints(self, operations: List[str]) -> int:
        l = []
        for i in range(len(operations)) :
            if operations[i] not in ["C", "D", "+"] :
                l.append(int(operations[i]))
            elif operations[i] == "C" :
                l.remove(l[len(l) - 1])
            elif operations[i] == "D" :
                l.append(l[len(l) - 1] * 2)
            else :
                l.append(l[len(l) - 1] + l[len(l) - 2])
        
        return sum(l)

