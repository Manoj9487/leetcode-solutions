class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lSum = 0, rSum = 0, l = 0, r = n - 1;     // start with left = 0 and right = n - 1

        for(int i = 0; i < k; i++) {
            lSum += cardPoints[i];       
        }                           // Calculate sum of elements in left array of length k - 1 
        int maxSum = lSum;
        for(int i = k - 1; i >= 0; i--) {
            rSum += cardPoints[r];        // Remove one left element and add one right element
            lSum -= cardPoints[i];
            r -= 1;                                    // Decrement right
            maxSum = Math.max(rSum + lSum, maxSum);   // Update maxSum
        
        }
        return maxSum;
    }
}
