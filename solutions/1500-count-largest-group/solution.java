class Solution {
    public int countLargestGroup(int n) {
        int[] count = new int[37]; 
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            count[sum]++;
        }
        int maxSize = 0;
        for (int freq : count) {
            maxSize = Math.max(maxSize, freq);
        }
        int groups = 0;
        for (int freq : count) {
            if (freq == maxSize) groups++;
        }
        return groups;
    }
}
