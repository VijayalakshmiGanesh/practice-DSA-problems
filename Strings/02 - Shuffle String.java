package Strings;

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
        // StringBuilder result=new StringBuilder(s.length());

        // for(int i=0; i<indices.length; i++){
        // result.insert(indices[i], (String)s.charAt(i));
        // }

        // return result.toString();
    }
}
