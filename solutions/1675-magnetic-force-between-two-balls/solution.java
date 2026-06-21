class Solution {
    private boolean minDistance(int[] position, int m, int d) {
        int last = position[0];
        int cnt = 1;
        for (int i = 1; i < position.length; i++) {
            if (position[i] - last >= d) {
                cnt += 1;
                last = position[i];
            }
        } 
        return cnt >= m;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1, high = Integer.MIN_VALUE;

        for(int i : position) {
            if (i > high) high = i;
        }

        int ans = high;

        while(low <= high) {
            int mid = (low + high) / 2;
            if (minDistance(position, m, mid)) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
