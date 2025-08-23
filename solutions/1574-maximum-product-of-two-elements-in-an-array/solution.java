class Solution {
    public int maxProduct(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[i] < nums[j]) {
                        int t = nums[j];
                        nums[j] = nums[i];
                        nums[i] = t;
                }
            }
        }
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
