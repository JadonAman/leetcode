class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (word.length() > 0) {
                    sb.append(word.reverse());
                    sb.append(' ');
                    word.setLength(0);
                }
            } else {
                word.append(s.charAt(i));
            }
        }

        if (word.length() > 0) {
            sb.append(word.reverse());
        }

        return sb.toString();
    }
}