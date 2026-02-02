class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int lastMin = Integer.MIN_VALUE;
        int count = 0;
        int maxSequence = 1;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 == lastMin) {
                count += 1;
                lastMin = nums[i];
                maxSequence = Math.max(count, maxSequence);
            }
            else if (nums[i] != lastMin) {
                count = 1;
                lastMin = nums[i];
            }
        }
        return maxSequence;
    }
}
