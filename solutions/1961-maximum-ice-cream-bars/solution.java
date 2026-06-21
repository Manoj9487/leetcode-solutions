class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        
        int n = 0;
        for (int i : costs) {
            if (coins <= 0 || i > coins) {
                break;
            }
            n++;
            coins -= i;
        }
        return n;
    }
}
