class Solution {
    public long coloredCells(int n) {
        if(n==1) return 1;
        long sum =1;
        for(int i=2; i<=n; i++){
            sum += 4*(i-1);
        }
        return sum;
    }
}