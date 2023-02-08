package Strings;

class Solution {
    public String sortSentence(String s) {

        StringBuilder result = new StringBuilder();
        String[] arr = s.split(" ");
        String resArr[] = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String index = arr[i].substring(arr[i].length() - 1);
            resArr[Integer.parseInt(index) - 1] = arr[i].substring(0, arr[i].length() - 1);

        }
        for (int i = 0; i < arr.length; i++) {
            result.append(resArr[i]);
            if (i < arr.length - 1)
                result.append(" ");
        }
        return result.toString();
    }
}