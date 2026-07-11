class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // Sort the array so we can use the two-pointer technique
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Once the fixed number is positive, no triplet can sum to zero
            if (nums[i] > 0) {
                break;
            }

            // Skip duplicate fixed numbers
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    // Increase the sum
                    left++;
                } else if (sum > 0) {
                    // Decrease the sum
                    right--;
                } else {

                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicate values on the left
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate values on the right
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}
