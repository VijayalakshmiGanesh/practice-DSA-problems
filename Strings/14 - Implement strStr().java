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

    // Better way
public int strStr(String haystack, String needle) {
    for (int i = 0; ; i++) { // The length of haystack
        for (int j = 0; ; j++) { // The length of needle
          if (j == needle.length()) return i; // If at this point we have navigated through the entire length of needle, we have found a solution, haystack[i].
          if (i + j == haystack.length()) return -1; // This happens when we run out of elements in haystack, but there are still elements in needle. 
          if (needle.charAt(j) != haystack.charAt(i + j)) break; // We stop comparing after needle[j], so i will be incremented and cycle repeats itself. 
        }
      }
    }