class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        int m = series1.length;
        int n = series2.length;

        int i = 0, j = 0;
        List<List<Integer>> res = new ArrayList<>();
        
        while(i < m || j < n) {
            int time;
            if (j == n || (i < m && series1[i][0] < series2[j][0])) {
                time = series1[i][0];
            }
            else if (i == m || (j < n && series1[i][0] > series2[j][0])) {
                time = series2[j][0];
            }
            else {
                time = series1[i][0];
            }
            List<Integer> temp = new ArrayList<>();
            int sum = 0;
            if (i < m && series1[i][0] == time) {
                sum += series1[i][1];
                i++;
            }
            else if (i < m && series1[i][0] > time) {
                sum += series1[i][1];
            }
            
            if (j < n && series2[j][0] == time) {
                sum += series2[j][1];
                j++;
            }
            else if (j < n && series2[j][0] > time) {
                sum += series2[j][1];
            }

            temp.add(time);
            temp.add(sum);

            res.add(temp);

            
        }
        return res;
    }
}
