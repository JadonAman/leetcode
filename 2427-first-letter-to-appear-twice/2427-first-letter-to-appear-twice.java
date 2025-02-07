class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character , Integer> hmp =new HashMap <>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            hmp.put(ch , hmp.getOrDefault(ch ,0) +1);
            if(hmp.get(ch)==2){
                return s.charAt(i);
                }
        }
        return 0;
    }
}