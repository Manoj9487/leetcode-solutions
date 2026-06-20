class Solution {
    private int findMax(int[] piles) {
        int max = Integer.MIN_VALUE;
        for(int i : piles) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    private int calcTime(int[] piles, int n) {
        int total = 0;
        for(int i : piles) {
            total += Math.ceil((double) i / (double) n);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = findMax(piles);
        int ans = high;
        while(low <= high) {
            int mid = (low + high) / 2;
            
            int totalTime = calcTime(piles, mid);

            if (totalTime <= h) {
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
