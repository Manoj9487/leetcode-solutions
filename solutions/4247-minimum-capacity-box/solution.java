class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int min = 101;
        int ans = -1;
        for(int i = 0; i < capacity.length; i++) {
            int num = capacity[i];

            if (num >= itemSize && min > num) {
                min = num;
                ans = i;
            }
        }
        return ans;
    }
}
