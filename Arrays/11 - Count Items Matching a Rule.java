class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        if(ruleKey.equals("type")){
            for(int i=0;i<items.size();i++)  
            {  
                if(items.get(i).get(0).equals(ruleValue) )
                    counter++;     
            }  
        }else if (ruleKey.equals("color")){
             for(int i=0;i<items.size();i++)  
            {  
                if(items.get(i).get(1).equals(ruleValue))
                    counter++;     
            } 
        }else if (ruleKey.equals("name")){
             for(int i=0;i<items.size();i++)  
            {  
                if(items.get(i).get(2).equals(ruleValue))
                    counter++;     
            } 
        }

        return counter;
    }
}


// Better way
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int rk = -1;
        if (ruleKey.equals("type")) { rk = 0; }
        else if (ruleKey.equals("color")) { rk = 1; }
        else { rk = 2; }

        int count = 0;
        int n = items.size();

        for (int i = 0; i < n; i++) {
            if (items.get(i).get(rk).equals(ruleValue)) { count++; }
        }
        return count;
    }
}