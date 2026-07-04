class Solution {
    public boolean lemonadeChange(int[] bills) {
        int change5 = 0, change10 = 0;

        for(int x : bills) {
            if (x == 5) change5++;
            else if (x == 10) {
                if (change5 > 0) {
                    change10++;
                    change5--;
                }
                else return false;
            }
            else {
                if (change5 > 0 && change10 > 0) {
                    change5--;
                    change10--;
                }
                else if (change5 >= 3) {
                    change5 -= 3;
                }
                else return false;
            }
        }
        return true;
    }
}
