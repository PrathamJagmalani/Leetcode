class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int [][]arr=new int[m][n];
        for(int i=0;i<indices.length;i++){
            int j=0;
            int k=indices[i][j];
             for(int y=0;y<n;y++){
                arr[k][y]++;
           }        
        }

        for(int i=0;i<indices.length;i++){
            int j=1;
            int k=indices[i][j];
             for(int y=0;y<m;y++){
                arr[y][k]++;
           }        
        }
            
         int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2!=0){
                    c++;
                }
            }
           }        
        return c;
    }
}