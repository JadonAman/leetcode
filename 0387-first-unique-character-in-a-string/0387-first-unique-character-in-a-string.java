class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character , Integer> hmp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch =s.charAt(i);
            hmp.put(ch , hmp.getOrDefault(ch,0) + 1);
        }
        for(int i=0; i<s.length(); i++){
            char ch =s.charAt(i);
            if(hmp.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
}