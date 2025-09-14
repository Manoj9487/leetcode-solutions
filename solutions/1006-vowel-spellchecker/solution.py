class Solution:
    def spellchecker(self, wordlist: List[str], queries: List[str]) -> List[str]:
        def mask(word) :
            return "".join('*' if ch in 'aeiou' else ch for ch in word.lower())
        
        d0 = set(wordlist)
        d1 = {w.lower() : w for w in wordlist[::-1]}
        d2 = {mask(w) : w for w in wordlist[::-1]}
        
        def solve(query) :
            if query in d0 : return query
            if query.lower() in d1 : return d1[query.lower()]
            if mask(query) in d2 : return d2[mask(query)]
            return ""
        return [solve(q) for q in queries]
