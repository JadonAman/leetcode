class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=1;
        int end = nums.length;
        if(end == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[end-1] != nums[end-2]) return nums[end-1];
        end=end-2;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            if((mid%2 == 1 && nums[mid-1]==nums[mid]) || (mid%2 ==0 && nums[mid]==nums[mid+1])){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}