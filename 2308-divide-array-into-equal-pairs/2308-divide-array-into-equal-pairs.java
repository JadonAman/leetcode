class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length%2!=0) return false;
        int[] arr = new int[501];
        Arrays.fill(arr , 0);
        for(int i=0; i<nums.length;i++){
            int j=nums[i];
            arr[j]++;
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k]%2!=0){
                return false;
            }
        }
        return true;
    }
}