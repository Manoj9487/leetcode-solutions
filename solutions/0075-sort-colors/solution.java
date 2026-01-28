class Solution {

    public static void Swap(int nums[], int a, int b) {
        int temp = nums[a];              
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;  // Dutch National Flag Algorithm

        while(mid <= high) {
            if (nums[mid] == 0) {
                Swap(nums, low, mid);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                Swap(nums, mid, high);
                high--;
            }

        }
    }
}
