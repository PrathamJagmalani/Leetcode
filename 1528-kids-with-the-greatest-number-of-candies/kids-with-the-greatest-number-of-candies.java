class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largest=candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>largest){
                largest=candies[i];
            }
        }
        ArrayList<Boolean> list=new ArrayList<>();
        int m=0;
        for(int c : candies){
          list.add((c+extraCandies)>=largest);  
        }
        return list;
    }
}