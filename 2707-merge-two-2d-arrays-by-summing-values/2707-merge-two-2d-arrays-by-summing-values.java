class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[][] nums = new int[400][2];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (nums1[i][0] == nums2[j][0]) {
                nums[k][0] = nums1[i][0];
                nums[k][1] = nums1[i][1] + nums2[j][1];
                i++;
                j++;
                k++;
            } else if (nums1[i][0] < nums2[j][0]) {
                nums[k] = nums1[i];
                k++;
                i++;
            } else {
                nums[k] = nums2[j];
                k++;
                j++;
            }
        }
        while (i < n) {
            nums[k++] = nums1[i++];
        }
        while (j < m) {
            nums[k++] = nums2[j++];
        }

        return Arrays.copyOf(nums, k);

    }
}