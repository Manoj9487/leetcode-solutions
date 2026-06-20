class Solution {
    private int lowerBound(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = nums.length;

        while(low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private int upperBound(int [] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = nums.length;

        while(low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums, target);
        int ub = upperBound(nums, target);
        
        if (lb == nums.length || nums[lb] != target) {
            int [] ans = {-1, -1};
            return ans;
        }
        else {
            int [] ans = {lb, ub - 1};
            return ans;
        }
    }
}
