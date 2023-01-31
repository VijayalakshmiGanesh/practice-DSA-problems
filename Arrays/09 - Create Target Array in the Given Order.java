class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int capacity = 0; 
        for(int i=0; i < nums.length; i++){
            if(i > index[i]){
                for(int j=capacity; j> index[i]; j--){
                    target[j] = target[j-1];
                }
            }
            target[index[i]] = nums[i];
            capacity++;
        }
        return target;
    }
}

//better way 
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            
           list.add(index[i],nums[i]);
        }
        int [] ans=new int [n];
        for(int i=0;i<n;i++){
           
            ans[i]=list.get(i);
        }
        return ans;
        
    }
}