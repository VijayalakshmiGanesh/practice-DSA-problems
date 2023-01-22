class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for(int i=0;i<nums.length;i++){
            int digitCount = 0;
            while(nums[i] >= 10){
                nums[i] /= 10;
                digitCount++;
            }
            digitCount++;
            
           if(digitCount %2 == 0)
                count++; 
        }
        return count;
    }
}