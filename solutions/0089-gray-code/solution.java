class Solution {
    public List<Integer> grayCode(int n) {
        int e = (int) Math.pow(2, n) - 1;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i <= e; i++) {
            ans.add(i ^ (i >> 1));
        }
        return ans;
    }
}
