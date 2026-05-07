class Solution {
    public int[] countOppositeParity(int[] nums) {
        int odd = 0;
        int even = 0;
        int n = nums.length;

        int [] result = new int[n];

        for(int i = n - 1; i >= 0; i--) {
            if ((nums[i] & 1) == 1) {
                result[i] = even;
                odd++;
            }
            else {
                result[i] = odd;
                even++;
            }
        }
        return result;


        
    }
}
