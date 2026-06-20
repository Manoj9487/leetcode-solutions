class Solution {
    private int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int i : nums) {
            if (i > max) max = i;
        }
        return max;
    }
    private boolean findSum(int[] nums, int threshold, int n) {
        int sum = 0;
        for(int i : nums) {
            sum += ((i + n - 1) / n);
        }
        return sum <= threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = findMax(nums);
        int ans = high;
        while(low <= high) {
            int mid = (low + high) / 2;

            if (findSum(nums, threshold, mid)) {
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
