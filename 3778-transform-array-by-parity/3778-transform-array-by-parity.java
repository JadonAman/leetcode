class Solution {
    public int[] transformArray(int[] nums) {
        for(int i=0; i< nums.length; i++){
            if(nums[i]%2 == 0){
                nums[i]=0;
            }else{
                nums[i]=1;
            }
        }
        int j=0;
        for(int k=0; k<nums.length ; k++){
            if(nums[k]==0){
            int temp = nums[j];
            nums[j]=nums[k];
            nums[k]=temp;
            j++;
            }
        }
       return nums;
    }
}