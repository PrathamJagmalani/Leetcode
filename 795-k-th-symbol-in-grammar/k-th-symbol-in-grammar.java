class Solution {
    public int kthGrammar(int n, int k) {
      if(k<=2) return k-1;
      return kthGrammar(n-1,(k+1)/2)==1 ? k%2 : (k+1)%2;
    }
}