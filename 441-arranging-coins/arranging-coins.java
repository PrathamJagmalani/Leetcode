class Solution {
    public int arrangeCoins(int n) {
        int t=n;
        for(int i=1;i<=t;i++){
            n-=i;
            if((n-i)<1) return i;
            
        }
        return -1;
    }
}