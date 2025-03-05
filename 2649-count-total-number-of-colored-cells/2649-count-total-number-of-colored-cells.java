class Solution {
    public long coloredCells(int p) {
        long n=p;
       long sum = 1+(4*((n*(n-1))/2));
       return sum;
    }
}