package Strings;

class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    x += 1;
                    break;
                case 'D':
                    x += -1;
                    break;
                case 'R':
                    y += 2;
                    break;
                case 'L':
                    y += -2;
                    break;
            }
        }

        return x == 0 && y == 0;
    }
}