class Solution {
    public int maximumDifference(int[] nums) {
        int minPrice = Integer.MAX_VALUE;
        int max =-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<minPrice){
                minPrice=nums[i];
            }
            int profit = nums[i]-minPrice;
            if(profit > max){
                max=profit;
            }
            if(max==0){
                max = -1;
            }
        }
        return max;
    }
}
