class Solution {
    public static void findMinimum(int [] nums, int multiplier) {
        int mini = Integer.MAX_VALUE;
        int index = 0;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] < mini) {
                mini = nums[i];
                index = i;
            }
        }

        nums[index] = nums[index] * multiplier;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k-- > 0) {
            findMinimum(nums, multiplier);
        }
        return nums;
    }
}
