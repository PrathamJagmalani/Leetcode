class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c != mat.length*mat[0].length ){
            return mat;
        }
       int reshape[][]=new int[r][c];
       List<Integer> list =new ArrayList<>();
       for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
          list.add(mat[i][j]);
        }
       } 
       int k=0;
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            
           reshape[i][j]=list.get(k++);
         }
        }

       return reshape;      
   }
}