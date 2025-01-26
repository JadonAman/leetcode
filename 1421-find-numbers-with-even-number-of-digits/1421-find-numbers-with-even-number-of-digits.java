class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i=0; i<nums.length; i++){
            int num =nums[i];
            if(evenCheck(num)){
                count++;
            }        
        }
        return count;
            
    }
    static boolean evenCheck(int num){
        int count=0;
        boolean ans=false;
        while(num>0){
            num = num/10;
            count++;
        }
        if(count%2==0){
            ans= true;
        }
        return ans;
    }
}