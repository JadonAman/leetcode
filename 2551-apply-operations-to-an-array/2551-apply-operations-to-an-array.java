class Solution {
    public int[] applyOperations(int[] nums) {
        int i=0;
        int n = nums.length-1;
        while(i<n){
            if(nums[i]!=nums[i+1]){
                i++;
            }else{
                nums[i] *=2;
                nums[i+1]=0;
                i+=2;
            }
        }
        int j=0;
        for(i=0;i<=n;i++){
            if(nums[i]!=0){
                int num =nums[j];
                nums[j] = nums[i];
                nums[i]=num;
                j++;
            }
        }
        return nums;
    }
}