class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length*2;
        int ans[] = new int[n];

        for(int i =0 ;i<n ;i++){
            if(i<(n/2)){
            ans[i] = nums[i];
            }
            else{
                ans[i] = nums[n-i-1];
            }
        }
        return ans;
    }
}
