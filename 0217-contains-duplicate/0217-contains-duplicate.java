class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer ,Integer> hmp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hmp.put(nums[i], hmp.getOrDefault(nums[i], 0) + 1);
            if(hmp.get(nums[i])>1){
                return true;
            }

        }
        return false;
    }
}