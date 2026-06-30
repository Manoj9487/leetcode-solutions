class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0, squareSum = 0;
        int rem = 0;
        while(n > 0) {
            rem = n % 10;
            digitSum += rem;
            squareSum += (rem * rem);
            n /= 10;
        }

        return (squareSum - digitSum) >= 50;
    }
}
