// Time complexity - O(n^2)
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int count =0;
        int index = 0;
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(j != i && nums[j] < nums[i])
                    count ++;
            }
            result[index++] = count;
            count = 0;
        }

        return result;
    }
}

