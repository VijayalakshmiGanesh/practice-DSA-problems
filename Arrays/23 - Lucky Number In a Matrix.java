import java.util.*;

class ain {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        int[][] matrix = { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } };
        List<Integer> arr1 = new ArrayList<>();
        arr1 = ain.luckyNumbers(matrix);

        for (int i : arr1) {
            System.out.println(i);
        }
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        int minNum = Integer.MAX_VALUE;
        int minIndex = 0;
        boolean fa = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < minNum) {
                    minNum = matrix[i][j];
                    minIndex = j;
                }
            }

            for (int j = 0; j < matrix.length; j++) {
                int k = matrix[j][minIndex];
                if (minNum < k) {
                    fa = false;
                    break;

                }
            }

            if (fa == true)
                arr.add(minNum);
            // System.out.println("row " + i + " " + minNum + " Index: " + minIndex);
            minIndex = -1;
            minNum = Integer.MAX_VALUE;
            fa = true;
        }
        return arr;
    }
}