class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashMap<Integer , Integer> hmp = new HashMap<>();
       ArrayList<Integer> arr = new ArrayList<>();
       int pointer =0;
       for (int num : nums1) {
            hmp.put(num, hmp.getOrDefault(num, 0) + 1);
        } 
       for(int num : nums2){
        if(hmp.containsKey(num)){
            arr.add(num);
            hmp.remove(num);
        }
       }
       int[] arr1 = new int[arr.size()];
        for (int nums : arr){
            arr1[pointer++]=nums;
        }
       return arr1;
    }
}