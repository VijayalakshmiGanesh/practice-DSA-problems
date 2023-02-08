package Strings;

class Solution {
    public String interpret(String command) {
        String result = new String();

        result = command.replace("()", "o").replace("(al)", "al");

        return result;
    }
}
