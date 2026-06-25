class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            int appears = 0;
            for(int j = i; j < nums.length; j++) {
                if (nums[j] == target) {
                    appears += 1;
                }
                if ((j - i + 1) / 2 < appears) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
