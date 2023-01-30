class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> ans = new ArrayList<Boolean>();
       int greatest = 0;
        for(int i=0; i<candies.length; i++){
            greatest = Math.max(greatest, candies[i]);
        }

       for(int i=0; i<candies.length; i++){
            ans.add(candies[i]+extraCandies >= greatest)
       }
        return ans;
    }
}