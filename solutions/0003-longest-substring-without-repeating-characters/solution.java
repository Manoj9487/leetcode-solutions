class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int l = 0, r = 0;

        while(r < n) {
            if (!charSet.contains(s.charAt(r))) {
                charSet.add(s.charAt(r));
                maxLength = Math.max(maxLength, r - l + 1);
            }
            else {
                while(charSet.contains(s.charAt(r))) {
                    charSet.remove(s.charAt(l));
                    l++;
                }
                charSet.add(s.charAt(r));
            }
            r++;
        }
        return maxLength;
    }
}

