package Strings;

class Solution {
    public boolean halvesAreAlike(String s) {
        String s1 = s.substring(0, s.length() / 2).toLowerCase();
        String s2 = s.substring((s.length() / 2), s.length()).toLowerCase();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            switch (s1.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count1++;
                    break;
            }
            switch (s2.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count2++;
                    break;
            }
        }
        System.out.println(s1 + " " + s2);
        System.out.println(count1 + " " + count2);

        return count1 == count2;

    }
}

// better approach

// String vowel ="aeiouAEIOU";
// int mid = s.length()/2;
// int count = 0;
// for(int i = 0, j = mid; i < mid; i++,j++){
// if(vowel.indexOf(s.charAt(i)) >=0)count++;
// if(vowel.indexOf(s.charAt(j)) >=0)count--;
// }

// return count ==0;
