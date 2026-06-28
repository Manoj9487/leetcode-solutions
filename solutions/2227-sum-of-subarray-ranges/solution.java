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
    
    private int[] findNGE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ans;
    }

    private int[] findPSEE(int[] arr) {
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

    private int[] findPGEE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }

    private long sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);
        long sum = 0;

        for(int i = 0; i < n; i++) {
            int left = i - psee[i];
            int right = nse[i] - i;
            long freq = 1L * left * right;
            sum += freq * arr[i];
        }
        return sum;
    }

    private long sumSubarrayMaxs(int[] arr) {

        int n = arr.length;
        int[] nge = findNGE(arr);
        int[] pgee = findPGEE(arr);
        long sum = 0;

        for(int i = 0; i < n; i++) {
            int left = i - pgee[i];
            int right = nge[i] - i;
            long freq = 1L * left * right;
            sum += freq * arr[i];
        }
        return sum;
    }
    public long subArrayRanges(int[] nums) {
        return sumSubarrayMaxs(nums) - sumSubarrayMins(nums);
    }
}
