class Solution {
    public boolean checkDivisibility(int n) {
        double temp=0;
        double temp2=1;
        double temp3=n;
        while(n>0){
            temp+=n%10;
            temp2*=n%10;
            n/=10;
        }
        boolean d=(temp3%(temp+temp2)==0);
        return d;
    }
}