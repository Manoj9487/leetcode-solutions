class Solution {
    private void findCombinations(int k, int num, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0 && k == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = num; i < 10; i++) {
            if (i > target || k == 0) break;
            ds.add(i);
            findCombinations(k - 1, i + 1, target - i, ans, ds);
            ds.remove(ds.size() - 1);

        } 
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(k, 1, n, ans, new ArrayList<>());
        return ans;
    }
}
