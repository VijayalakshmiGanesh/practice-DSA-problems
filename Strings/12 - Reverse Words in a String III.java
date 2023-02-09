package Strings;

class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : arr) {
            for (int i = word.length() - 1; i >= 0; i--) {
                result.append(word.charAt(i));
            }
            result.append(" ");
        }

        return result.toString().trim();
    }
}
