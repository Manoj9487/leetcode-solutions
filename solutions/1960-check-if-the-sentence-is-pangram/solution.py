class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        alphabet = "abcdefghijklmnopqrstuvwxyz"
        for i in alphabet :
            if i not in sentence :
                return False
        return True

