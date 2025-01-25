class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int pos = -1;
        char[] arr = haystack.toCharArray();
        char[] arr1 = needle.toCharArray();
        for (int i = 0; i <= arr.length - arr1.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i + j] != arr1[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return pos;
    }
}
