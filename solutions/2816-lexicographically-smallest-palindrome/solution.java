class Solution {
    public String makeSmallestPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        char[] ans = new char[s.length()];

        while(l <= r) {
            char ch1 = s.charAt(l);
            char ch2 = s.charAt(r);

            if (ch1 != ch2) {
                if (ch1 > ch2) {
                    ans[l] = ch2;
                    ans[r] = ch2;
                }
                else {
                    ans[l] = ch1;
                    ans[r] = ch1;
                }
            }
            else {
                ans[l] = ch1;
                ans[r] = ch2;
            }
            l++;
            r--;
        }
        return String.valueOf(ans);
    }
}
