class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int [ 2 * nums.length ];
        int index = 0;
        for(int i=0; i < nums.length; i++){
            result[i] = nums[i];
            result[i+nums.length] = nums[i];
            
            // if( i < nums.length)
            //     result[i] = nums[i];
            // else
            //     result[i] = nums[index++];
        }
        return result;
    }
}