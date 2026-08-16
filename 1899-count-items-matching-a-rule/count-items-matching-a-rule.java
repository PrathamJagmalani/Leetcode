class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(int i=0;i<items.size();i++){
            List<String> list=items.get(i);
            
              if((ruleKey.equals("color") && list.get(1).equals(ruleValue)) || (ruleKey.equals("type") && list.get(0).equals(ruleValue)) || (ruleKey.equals("name") && list.get(2).equals(ruleValue))){
                count++;
              
            }
        }
        return count;
    }
}