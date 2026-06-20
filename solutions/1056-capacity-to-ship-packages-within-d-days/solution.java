class Solution {
    private boolean capacity(int[] weights, int days, int n) {
        int cnt = 1, total = 0;
        for(int i : weights) {
            if (i + total <= n) {
                total += i;
            }
            else {
                cnt += 1;
                total = i;
            }
        }
        return cnt <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        int high = 0;

        for(int i : weights) {
            if (low < i) low  = i;
            high += i;
        }

        int ans = high;
        
        while(low <= high) {
            int mid = (low + high) / 2;
            if (capacity(weights, days, mid)) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
