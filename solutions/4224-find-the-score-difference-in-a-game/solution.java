class Solution {
    public int scoreDifference(int[] nums) {
        int p1 = 1;
        int p2 = 0;
        int p1_score = 0;
        int p2_score = 0;
        int cnt = 0;
        for(int i : nums) {
            cnt += 1;
            if (cnt == 6) {
                int temp = p1;
                p1 = p2;
                p2 = temp;
                cnt = 0;
            }
            if (i % 2 == 1) {
                int temp = p1;
                p1 = p2;
                p2 = temp;
            }
            if (p1 == 1) {
                p1_score += i;
            }
            else {
                p2_score += i;
            }
        }
        return p1_score - p2_score;
    }
}
