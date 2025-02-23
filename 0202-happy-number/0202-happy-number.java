class Solution {
    private static int sum(int n){
        int sum1 = 0;
        while(n>0){
            int a = n%10;
            sum1 = sum1 + (a*a);
            n = n/10;
        }
        return sum1;
    }
    public boolean isHappy(int n) {
        while(n !=1 && n !=4){
            n = sum(n);
        }
        return n==1;
    }
}