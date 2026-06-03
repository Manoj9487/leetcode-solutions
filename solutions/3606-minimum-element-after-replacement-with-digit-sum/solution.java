class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            int rem = 0;
            int sum = 0;
    
            while(num > 0) {
                rem = num % 10;
                sum += rem;
                num /= 10;
            }
            if (sum < min) min = sum;
        }
        return min;
    }
}
