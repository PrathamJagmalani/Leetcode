class Solution {
    public int minCostToMoveChips(int[] position) {
        int e=0;
        int o=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){
              e++;
            }else{
                o++;
            }
        }
        if(e>o){
            return o;
        }else if(o>e){
            return e;
        }
        return e;
    }
}