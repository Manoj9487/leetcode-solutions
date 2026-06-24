class Solution {
    private void findCombinations(int ind, int[] arr, List<List<Integer>> ans, List<Integer> ds) {
        if (ind == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[ind]);
        findCombinations(ind + 1, arr, ans, ds);
        ds.remove(ds.size() - 1);
        findCombinations(ind + 1, arr, ans, ds);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, nums, ans, new ArrayList<>());
        return ans;
    }
}
