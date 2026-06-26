class Solution {
    public int minOperations(int[] nums, int k) {
        int currXOR = 0;
        for(int i : nums) {
            currXOR ^= i;
        }
        int flips = currXOR ^ k;
        int cnt = 0;
        
        for(int i = 0; i < 32; i++) {
            if ((flips & (1 << i)) > 0) cnt++;
        }
        
        return cnt;
    }
}
