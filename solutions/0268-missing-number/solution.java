class Solution {
    public int missingNumber(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i < nums.length; i++) {
            xor1 = xor1 ^ (i);    // For n = 5 xor will be upto 4
            xor2 = xor2 ^ nums[i];     // XOR of elements in array
        }

        xor1 = xor1 ^ (nums.length);

        return xor1 ^ xor2;
    }
}
