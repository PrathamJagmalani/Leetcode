class Solution {
    long mod=1000000007;
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        
        long first=power(5,even);
        long second=power(4,odd);

        return (int)((first*second)%mod);
    
    }
    private long power(long a , long b){
        if(b==0) return 1;

        long half=power(a,b/2);
        long result=(half*half)%mod;
        if(b%2==1) result=(result*a)%mod;
        return result;
    }
}