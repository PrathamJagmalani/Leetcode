class Solution {
    public int maximumPopulation(int[][] logs) {
        int arr[]=new int[logs.length];
      for(int i=0;i<logs.length;i++){
           int c=0;
      for(int j=0;j<logs.length;j++){

          if(logs[j][0]<=logs[i][0] && logs[j][1]>logs[i][0]){
            c++;
          }
       } 
       arr[i]=c;
     } 
     int largest=arr[0];
     int year=logs[0][0];
     for(int i=1;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
            year=logs[i][0];
        }else if(arr[i]==largest && logs[i][0]<year){
            year=logs[i][0];
        }
     } 
     
     return year;
   }
}