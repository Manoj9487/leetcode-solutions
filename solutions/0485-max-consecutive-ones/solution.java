class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0;
        int cnt = 0;
        for (int i : nums) {
            if (i == 1) {
                cnt += 1;
                maxi = Math.max(cnt, maxi);
            }
            else {
                cnt = 0;
            }
        }
        return maxi;
    }
}
