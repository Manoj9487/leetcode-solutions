class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int i = nums.length - 1;
        long ans = 0;
        while(k > 0) {
            if (mul > 0) ans += (long) mul * nums[i];
            else ans += (long) nums[i];
            
            mul--;
            k--;
            i--;
        }
        return ans;
    }
}
