class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        return checkPower(n,1);
    }

    public boolean checkPower(int n, long currentPower){
        if(currentPower==n)return true;
        if(currentPower>n)return false;

        return checkPower(n , currentPower*3);
    }
}