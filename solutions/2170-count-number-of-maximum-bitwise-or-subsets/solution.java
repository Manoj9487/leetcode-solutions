class Solution {
    private int backtrack(int[] nums, int maxOR, int idx, int currentOR) {
        if (idx == nums.length) {
            return currentOR == maxOR ? 1 : 0;
        }
        if (currentOR == maxOR) return 1 << (nums.length - idx);

        return backtrack(nums, maxOR, idx + 1, currentOR | nums[idx]) + backtrack(nums, maxOR, idx + 1, currentOR);
    }
    public int countMaxOrSubsets(int[] nums) {
        int maxOR = 0;

        for(int i : nums) {
            maxOR |= i;
        }
        
        return backtrack(nums, maxOR, 0, 0);
    }
}
