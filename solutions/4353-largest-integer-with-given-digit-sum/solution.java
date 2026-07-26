class Solution {
    public int largestInteger(int n, int s) {
        if (s == 0) {
            return 0;
        }
        if (n * 9 < s) {
            return -1;
        }
        StringBuilder num = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int d = Math.min(s, 9);
            num.append(d);
            s -= d;
        }
        return Integer.parseInt(num.toString());
    }
}
