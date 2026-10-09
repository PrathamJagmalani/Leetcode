class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)return false;
       return PowerOfTwo(n,1);
    }

    public boolean PowerOfTwo(int n,long x) {
        if(x == n)return true;
        if(x>n)return false;

        return PowerOfTwo(n,x*2);
        
    }
}