class Solution {
    public int majorityElement(int[] nums) {
        int ele = 0;
        int cnt = 0;
        for (int i : nums) {
            if (cnt == 0) {
                cnt += 1;
                ele = i;
            }
            else if (i == ele) {
                cnt++;
            }
            else {
                cnt--;
            }
        }

        int cnt1 = 0;
        for(int i : nums) {
            if (i == ele) {
                cnt1 += 1;
            }
            if (cnt1 > Math.floor(nums.length / 2)) {
                return ele;
            }
        }
        return -1;
    }
}
