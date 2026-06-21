class Solution {
    private boolean minSum(int [] nums, int k, int n) {
        int cnt = 1, splitSum = 0;
        for(int i : nums) {
            if (i + splitSum <= n) {
                splitSum += i;
            }
            else {
                cnt += 1;
                splitSum = i;
            }
        }
        return cnt <= k;
    }
    public int splitArray(int[] nums, int k) {

        int low = Integer.MIN_VALUE, high = 0;

        for(int i : nums) {
            if (low < i) low = i;
            high += i;
        }

        int ans = 0;

        while(low <= high) {
            int mid = (low + high) / 2;

            if (minSum(nums, k, mid)) {
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
