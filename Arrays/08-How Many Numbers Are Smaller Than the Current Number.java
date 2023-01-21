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


//Time complexity - O(n)
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int[] count = new int[101]; // assuming the range of elements in the array is [0, 100]

        // Count the frequency of each element in the array
        for (int num : nums) {
            count[num]++;
        }

        // Calculate the prefix sum of the count array
        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }

        // Iterate through the original array and calculate the smaller numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[i] = count[nums[i] - 1];
            }
        }

        return result;
    }
}
