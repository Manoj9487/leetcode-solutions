class Solution:
    def maxFreqSum(self, s: str) -> int:
      count = Counter(s)
      max_vowel = 0
      max_consonant = 0
      for key, value in count.items() :
        if (key in "aeiou") :
            if max_vowel < value :
                max_vowel = value
        else :
            if max_consonant < value :
                max_consonant = value
      return max_consonant + max_vowel
