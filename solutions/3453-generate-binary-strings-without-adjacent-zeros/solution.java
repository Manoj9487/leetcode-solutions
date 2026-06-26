class Solution {
    private void dfs(int n, StringBuilder sb, List<String> ans) {
        if (sb.length() == n) {
            ans.add(sb.toString());
            return;
        }

        sb.append('1');
        dfs(n, sb, ans);
        sb.deleteCharAt(sb.length() - 1);

        if (sb.length() == 0 || sb.charAt(sb.length() - 1) == '1') {
            sb.append('0');
            dfs(n, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> validStrings(int n) {

        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(n, sb, ans);
        
        return ans;
    }
}
