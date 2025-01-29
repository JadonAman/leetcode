class Solution {
    public boolean detectCapitalUse(String word) {
        return word.toUpperCase()==word
        ||word.toLowerCase()==word
        ||word.substring(1).equals(word.substring(1).toLowerCase());
    }
}