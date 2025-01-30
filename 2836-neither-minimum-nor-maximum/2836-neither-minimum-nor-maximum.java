class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<=2){
            return -1;
        }
        int min =Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        for(int i =0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
            if(nums[i]<min){
                min =nums[i];
            }
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j]<max&&nums[j]>min){
                return nums[j];
            }
        }
        return -1;
    }
}