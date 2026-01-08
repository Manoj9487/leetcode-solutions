
class Solution:
    def subdomainVisits(self, cpdomains: List[str]) -> List[str]:
        cnt = defaultdict(int)
        for s in cpdomains :
            c, dmn = s.split()
            c = int(c)
            parts = dmn.split('.')
            for i in range(len(parts)) :
                cnt['.'.join(parts[i:])] += c 
        return [f"{v} {k}" for k, v in cnt.items()]
