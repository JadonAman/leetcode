class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0) return 0;
        int counter=1;
        int max =1;
        for(int i=0; i< nums.length-1; i++){
            if(nums[i]+1 ==nums[i+1]){
                counter++;
            }else if(nums[i]==nums[i+1]){
                continue;
            }
            else if(nums[i]+1 != nums[i+1]){
                counter=1;
            }
            if(counter> max){
                max = counter;
            }
        }
        return max;
    }
}