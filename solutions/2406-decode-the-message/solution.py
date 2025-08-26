class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        seen = []
        for ch in key:
            if ch.islower() and ch not in seen and ch != ' ':
                seen.append(ch)
                if len(seen) == 26:
                    break
        mapping = {k: a for k, a in zip(seen, 'abcdefghijklmnopqrstuvwxyz')}
        return ''.join(mapping.get(c, c) for c in message)

