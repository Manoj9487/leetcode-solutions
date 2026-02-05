class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int [] arr = new int[n];

        for(int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                arr[i] = nums[i];
            }
            else {
                arr[i] = nums[(i + nums[i] % n + n) % n];
            }
        }
        return arr;
    }
}
