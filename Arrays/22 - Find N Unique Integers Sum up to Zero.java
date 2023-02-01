class Solution {
    public int[] sumZero(int n) {
       int[] arr = new int[n];
       int index = 0;

        if(n%2 == 1){
            arr[index++] = 0;
        }

        for(int i=1; i<=n/2; i++){
            arr[index++] = i;
            arr[index++] = -i;
        }
        
        return arr;
    }
}


//better solution 
class Solution {
    public int[] sumZero(int n) {
       int[] arr = new int[n];
        for(int i=0; i<n; i++){
           arr[i] = i * 2 - n + 1;
        }
        return arr;
    }
}


  