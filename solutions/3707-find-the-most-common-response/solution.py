class Solution:
    def findCommonResponse(self, responses: List[List[str]]) -> str:
        count = defaultdict(int)

        for item in responses :
            for j in set(item) :
                count[j] += 1
        
        max_count = max(count.values())
        most_common = min(response for response, cnt in count.items() if cnt == max_count)
        return most_common
