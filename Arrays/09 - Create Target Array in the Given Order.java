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