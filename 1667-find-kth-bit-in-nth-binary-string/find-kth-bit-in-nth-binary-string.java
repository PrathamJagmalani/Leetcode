class Solution {
    public char findKthBit(int n, int k) {
       StringBuilder s=new StringBuilder("0");
        return helper(s,k);
    }
    private char helper(StringBuilder s,int k){
       if(s.length()>=k){
            return s.charAt(k-1);
        }
        StringBuilder reverse=new StringBuilder(s);
        reverse.reverse();
        int j=0;
        while(j<reverse.length()){
            if(reverse.charAt(j)=='0') reverse.setCharAt(j,'1');
            else reverse.setCharAt(j,'0');
            j++;
            }
        s.append("1");
        s.append(reverse);
        return helper(s,k);
    }
}