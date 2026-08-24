class Solution {
    public int[] sumZero(int n) {
        int [] arr=new int[n];
        if(n%2==1){
            arr[n/2]=0;
        }
        for(int i=0;i<n;i++){
            if(i==n/2){
                continue;
            }
            arr[i]=i+1;
            arr[n-i-1]=arr[i]-(2*arr[i]);
        }
        return arr;
    }
}