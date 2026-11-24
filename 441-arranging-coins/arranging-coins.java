class Solution {
    public int arrangeCoins(int n) {
        if(n==1)return 1;
        int t=n;
        for(int i=1;i<=t;i++){
            if((n-i==0))return i;
           else if((n-i)<1) return i-1;
            n-=i;
        }
        return -1;
    }
}