class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        int f = 0;

        for(int i : freq.values()) {
            f = Math.max(f, i);
        }

        int dist = Integer.MAX_VALUE;

        for(int key : freq.keySet()) {
            if (freq.get(key) == f) {
                int l = 0, r = nums.length - 1;
                while(l <= r) {
                    if (nums[l] == key) break;
                    l++;
                }
                while(l < r) {
                    if (nums[r] == key) break;
                    r--;
                }
                dist = Math.min(dist, r - l + 1);
            }
        }
        return dist;
    }
}
