class Solution {
    public int longestSubstring(String s, int k) {
        if (s.length() < k) return 0;

        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (freqMap.get(s.charAt(i)) < k) {
                String left = s.substring(0, i);
                String right = s.substring(i + 1);

                return Math.max(longestSubstring(left, k), longestSubstring(right, k));
            }
        }

        
        return s.length();
    }
}
