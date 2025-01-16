class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int val = 0;

        while (num > 0) {
            int y = num % 10; 
            val = val * 10 + y; 
            num = num / 10; 
        }

        return x == val;
    }
}
