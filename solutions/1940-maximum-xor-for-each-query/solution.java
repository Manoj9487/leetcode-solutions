class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int maxXOR = (1<< maximumBit) - 1;
        int currXOR = nums[0];
        int answer[] = new int[nums.length];

        for(int i = 1; i < nums.length; i++) {
            currXOR ^= nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            answer[i] = maxXOR ^ currXOR;
            currXOR ^= nums[nums.length - i - 1];
        }
        return answer;
    }
}
