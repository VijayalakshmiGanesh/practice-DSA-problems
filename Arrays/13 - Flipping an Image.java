class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int temp;
        for(int i=0; i<image.length; i++){
            for(int j=0, k=image[0].length-1; j!=k && j<=k; j++, k-- ){
                temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;

                
            }
        }
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image.length; j++){
                 if(image[i][j] == 0) {
                     image[i][j] = 1;
                 }else{
                    image[i][j] = 0;
                 } 
            }
        }
        return image;
    }
}