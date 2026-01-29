class Solution {
    public int majorityElement(int[] nums) {

        Map <Integer, Integer> hashmap = new HashMap<>();

        for (int num : nums) {
            hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);

            if (hashmap.get(num) > Math.floor(nums.length / 2)) {
                return num;
            }
        }
        return -1;

    }
}
