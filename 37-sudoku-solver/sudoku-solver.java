class Solution {
   public static boolean isSafe(char[][]board,int row,int col,int i){
    for(int j=0;j<9;j++){
        if(board[row][j]==i) return false;
    }
    
   for(int j=0;j<9;j++){
        if(board[j][col]==i) return false;
    }
    
    int srow=(row/3)*3;
    int scol=(col/3)*3;
    for(int j=srow;j<=srow+2;j++){
        for(int k=scol;k<=scol+2;k++){
            if(board[j][k]==i) return false;
        }
    }


    return true;
      }

    public static boolean solver(char[][]board,int row,int col){
        if(row == 9){
            return true;
        }

        int nextRow=row; int nextCol=col+1;
        if(nextCol == 9){
            nextRow=row+1;
            nextCol=0;
        }

        if(board[row][col]!='.'){
            return solver(board,nextRow,nextCol);
        }
        

        for(char i='1';i<='9';i++){
            if(isSafe(board,row,col,i)){
              board[row][col]=i;

            if(solver(board,nextRow,nextCol)){
                return true;
            }

            board[row][col]='.';
            }

        }
        return false;

    }

    public void solveSudoku(char[][] board) {
        List<List<Character>> ans=new ArrayList<>();
        
        solver(board,0,0);
        
    }
}