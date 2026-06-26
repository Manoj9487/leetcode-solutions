class Solution {
    private void invert(int[] row) {
        for(int i = 0; i < row.length; i++) {
            row[i] = row[i] == 1 ? 0 : 1;
        }
    }
    private void reverse(int[] row) {
        int i = 0, j = row.length - 1;
        while(i < j) {
            row[i] ^= row[j];
            row[j] ^= row[i];
            row[i] ^= row[j];
            i++;
            j--;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++) {
            reverse(image[i]);
            invert(image[i]);
        }
        return image;
    }
}
