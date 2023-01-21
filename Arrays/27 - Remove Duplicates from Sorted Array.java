class Solution {
    public int removeDuplicates(int[] nums) {
        int elem=nums[0];
        int count =1;
        for(int j=1;j<nums.length;j++){
            if(nums[j] != elem){
                nums[count] = nums[j];
                elem = nums[j];
                count++;
            }
        }
         return count;
    }
}