class Solution {
    public boolean isPerfectSquare(int num) {
        if (Math.pow(num, 0.5) == Math.floor(Math.pow(num, 0.5))) {
            return true;
        }
        return false;
    }
}
