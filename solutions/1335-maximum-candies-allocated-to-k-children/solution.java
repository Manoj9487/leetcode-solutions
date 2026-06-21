class Solution {
    private boolean canDistribute(int[] candies, long k, int n) {
        long cnt = 0;
        for(int i : candies) {
            if (i >= n) cnt += i / n;
        }
        return cnt >= k;
    }
    public int maximumCandies(int[] candies, long k) {

        int low = 1, high = Integer.MIN_VALUE;

        for(int i : candies) {
            if (i > high) high = i;
        }

        int ans = 0;

        while(low <= high) {
            int mid = (low + high) / 2;

            if (canDistribute(candies, k, mid)) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        
        return ans;
    }
}
