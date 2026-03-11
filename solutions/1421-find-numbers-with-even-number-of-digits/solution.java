class Solution {
    public int findNumbers(int[] nums) {
        int even_cnt = 0;

        for(int i : nums) {
            int digits = 0;
            while(i > 0) {
                i /= 10;
                digits += 1;
            }
            if (digits % 2 == 0) {
                even_cnt += 1;
            }
        }
        return even_cnt;
    }
}
