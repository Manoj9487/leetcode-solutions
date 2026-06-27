class Solution {
    private int[] findNSE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            } 
            
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ans;
    }
    private int[] findPSE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;

        int[] pse = findPSE(arr);
        int[] nse = findNSE(arr);

        int mod = (int)1e9 + 7;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            int left = i - pse[i];
            int right = nse[i] - i;

            long freq = left * right * 1L;
            int val = (int)((freq * arr[i]) % mod);

            sum = (sum + val) % mod;
        }
        
        return sum;
    }
}
