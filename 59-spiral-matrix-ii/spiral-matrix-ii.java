class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int srow=0;
        int erow=n-1;
        int scol=0;
        int ecol=n-1;
        int s=1;
        while(srow<=erow && scol<=ecol ){
            for(int i=scol;i<=ecol;i++){
                matrix[srow][i]=s;
                s++;
            }
            
            for(int i=srow+1;i<=erow;i++){
                matrix[i][ecol]=s;
                s++;
            }
            for(int i=ecol-1;i>=scol;i--){
                if(srow==erow){
                    break;
                }
                matrix[erow][i]=s;
                s++;
            }
            for(int i=erow-1;i>srow;i--){
                if(scol==ecol){
                    break;
                }
                matrix[i][scol]=s;
                s++;

            }
            srow++;
            erow--;
            scol++;
            ecol--;
        }
        return matrix;

    }
}