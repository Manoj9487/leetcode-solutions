class Solution:
    def countKeyChanges(self, s: str) -> int:
        new=s.lower()
        count=0
        for i in range(len(new)-1):
            if new[i]!=new[i+1]:
                count+=1
        return(count)
