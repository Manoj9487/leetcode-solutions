class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];
        int[] seen = new int[n + 1];
        int common = 0;

        for(int i = 0; i < n; i++) {
            seen[A[i]] ^= 1;                  // If Occured once 0 ^ 1 = 1
            if (seen[A[i]] == 0) common++;   

            seen[B[i]] ^= 1;                // If Occured twice it will be now 1 -> 1 ^ 0 = 0
            if (seen[B[i]] == 0) common++;

            ans[i] = common;
        }
        return ans;
    }
}
