class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0,j=0;i<mat.length && j<mat[i].length;i++,j++){
           sum+=mat[i][j];
        }
        for(int i=0,j=mat[i].length-1;i<mat.length && j>=0;i++,j--){
            sum+=mat[i][j];
        }
        if(mat.length%2!=0){
          sum-=mat[mat.length/2][mat[0].length/2]; 
        }
        return sum;
    }
}