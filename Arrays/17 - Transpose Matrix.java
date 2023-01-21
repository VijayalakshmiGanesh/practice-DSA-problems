class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int[][] result = new int[matrix[0].length][m];
        for(int i=0; i<m; i++){
            for(int j = matrix[0].length-1; j>=0; j--){
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}