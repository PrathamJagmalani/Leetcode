class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int t=0;
        while(x>0){
            int d=x%10;
            t=t*10+d;
            x=x/10;

        }
        if(num==t){
            return true;
        }else{
            return false;
        }
        
    }
}