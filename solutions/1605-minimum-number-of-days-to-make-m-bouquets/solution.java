class Solution {
    private boolean countBouquet(int [] bloomDay, int m, int k , int day) {
        int totalBq = 0, cnt = 0;
        for(int i : bloomDay) {
            if (i <= day) {
                cnt += 1;
            }
            else {
                totalBq += cnt / k;
                cnt = 0;
            }
        }
        totalBq += cnt / k;

        return totalBq >= m ? true : false;
    }
    public int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length) return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        int ans = -1;

        for (int i : bloomDay) {
            if (i < low) low = i;
            if (i > high) high = i;
        }

        while(low <= high) {
            int mid = (low + high) / 2;

            if (countBouquet(bloomDay, m, k, mid)) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
