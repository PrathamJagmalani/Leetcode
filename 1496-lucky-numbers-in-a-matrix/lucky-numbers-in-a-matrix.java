class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(largest(matrix[i][j], matrix) && smallest(matrix[i][j], matrix)) list.add(matrix[i][j]);
            }
        }
        return list;
    }

    private boolean largest(int num,int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==num){
                   for(int k=0;k<matrix.length;k++){
                        if(matrix[k][j]>num) return false;
                    }
                    return true;
                    
                }
            }
        }
        return false;
    }

    private boolean smallest(int num,int[][] matrix){
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==num){
                   for(int k=0;k<matrix[i].length;k++){
                        if(num>matrix[i][k]) return false;
                    }
                    return true;
                    
                }
            }
        }
         return false;
    }
   
}