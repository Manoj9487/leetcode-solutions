class Solution {
    private boolean binarySearch(int nums[], int target) {
        int low = 0, high = nums.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return true;
            }
            else if (nums[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return false;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return intersection(nums2, nums1);
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        List<Integer> arr = new ArrayList<>();

        int len = nums1.length;

        for(int i = 0; i < len; i++) {
            if (binarySearch(nums2, nums1[i]) && !arr.contains(nums1[i])) {
                arr.add(nums1[i]);
            } 
        }

        int[] res = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i); 
        }

        return res;
    }
}
