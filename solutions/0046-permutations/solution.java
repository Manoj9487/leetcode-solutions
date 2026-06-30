class Solution {
    private void backtrack(int[] nums, List<Integer> ds, List<List<Integer>> res) {
        if (ds.size() == nums.length) {
            res.add(new ArrayList<>(ds));
        }
        else {
            for(int i = 0; i < nums.length; i++) {
                if (ds.contains(nums[i])) continue;

                ds.add(nums[i]);
                backtrack(nums, ds, res);
                ds.remove(ds.size() - 1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();

        backtrack(nums, new ArrayList<>(), res);

        return res;
    }
}
