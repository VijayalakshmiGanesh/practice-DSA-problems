package Strings;

class Solution {
    public int strStr(String haystack, String needle) {
        boolean flag = false;
        int idx = -1;
        if (!haystack.contains(needle))
            return idx = -1;

        for (int i = 0, j = 0; i < haystack.length() && j < needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                flag = true;
                idx = i;
                j++;
            } else {
                i = i - j;
                flag = false;
                j = 0;
            }
            if (j == needle.length())
                break;
        }

        if (flag == true)
            idx = idx - needle.length() + 1;
        // else idx=-1;

        return idx;
    }
}