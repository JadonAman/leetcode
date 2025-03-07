class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) return false; 

        HashMap<Character, String> hmp = new HashMap<>();
        HashSet<String> usedWords = new HashSet<>(); 

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = arr[i];

            if (hmp.containsKey(c)) {
                if (!hmp.get(c).equals(word)) return false; 
            } else {
                if (usedWords.contains(word)) return false;
                hmp.put(c, word);
                usedWords.add(word);
            }
        }
        return true;
    }
}