class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)return false;
       return checkPower(n,1);
    }

    public boolean checkPower(int n,long currentPower) {
        if(currentPower == n)return true;
        if(currentPower>n)return false;

        return checkPower(n,currentPower*2);
        
    }
}