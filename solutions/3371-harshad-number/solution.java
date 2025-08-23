class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int t = x;
        while(x > 0) {

            int rem = x % 10;
            sum += rem;
            x /= 10;
        }
        if (t % sum == 0) {
            return sum;
        }
        else {
            return -1;
        }
    }
}
