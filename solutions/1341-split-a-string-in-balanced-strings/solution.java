class Solution {
    public int balancedStringSplit(String s) {
        int cnt = 0, balance = 0;

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                balance += 1;
            }
            else {
                balance -= 1;
            }

            if (balance == 0) {
                cnt += 1;
            }
        }
        return cnt;
    }
}
