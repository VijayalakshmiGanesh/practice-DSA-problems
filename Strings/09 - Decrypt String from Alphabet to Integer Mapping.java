package Strings;

class Solution {
    public String freqAlphabets(String s) {
        StringBuilder str = new StringBuilder();
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 2 && s.charAt(i + 2) == '#') {
                idx = 96 + Integer.parseInt("" + s.charAt(i) + s.charAt(i + 1));
                i += 2;
            } else {
                idx = 96 + Integer.parseInt("" + s.charAt(i));
            }
            str.append((char) idx);
        }

        return str.toString();
    }
}

// Another solution

// class Solution {
// public String freqAlphabets(String s) {

// StringBuilder sb = new StringBuilder();

// for(int ind=s.length()-1;ind>=0;ind--)
// {
// if(s.charAt(ind)=='#')
// {
// sb.append((char)('a'+(s.charAt(ind-1)-'0')+10*(s.charAt(ind-2)-'0')-1));

// ind-=2;
// }
// else
// sb.append((char)('a'+(s.charAt(ind)-'0')-1));
// }

// return sb.reverse().toString();
// }
// }