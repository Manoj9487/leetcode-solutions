class Solution {
    private int atMost(int[] nums, int k) {
        int cnt = 0;
        int l = 0, r = 0;
        int ans = 0;

        while(r < nums.length) {
            if (nums[r] % 2 == 1) cnt++;

            while(cnt > k) {
                if (nums[l] % 2 == 1) cnt--;
                l++;
            }

            ans += (r - l + 1);
            r++;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
}

