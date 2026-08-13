class Solution {
    public int maximumWealth(int[][] accounts) {
     int arr[]=new int[accounts.length];
     int sum=0;
     for(int i=0;i<accounts.length;i++){
        sum=0;
      for(int j=0;j<accounts[i].length;j++){
        sum+=accounts[i][j];

      }
      
      arr[i]=sum;              
     }   
       
         int s=arr[0];
        for(int m=1;m<arr.length;m++){
            if(arr[m]>s){
                s=arr[m];
        }
        }
        return s;
    }
}
                                                                                                                                                                    
    

    