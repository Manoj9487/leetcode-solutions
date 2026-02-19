class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();

        for (int i : candyType) {
            set.add(i);
        }

        int n = candyType.length;
        int m = set.size();

        return Math.min(n / 2, m);
    }
}
