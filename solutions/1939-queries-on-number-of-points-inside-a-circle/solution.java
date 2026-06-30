class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int ql = queries.length;
        int[] ans = new int[ql];
        for (int i = 0; i < ql; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            int r = queries[i][2];
            int count = 0;

            for (int[] point : points) {
                int dx = point[0] - x;
                int dy = point[1] - y;

                if (dx * dx + dy * dy <= r * r) {
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}
