class Solution {
    public static boolean isSafe(String board[][],int row,int col,int n){
        for(int i=0;i<n;i++){
            if(board[row][i].equals("Q")) return false;
        }
        
        for(int i=0;i<n;i++){
            if(board[i][col].equals("Q")) return false;
        }

        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j].equals("Q")) return false;
        }

        for(int i=row,j=col;i>=0 && j<n;i--,j++){
            if(board[i][j].equals("Q")) return false;
        }

        return true;
    }
    
    void nQueens(String board[][],int row,int n,List<List<String>> ans){
       if (row == n) {
             List<String> currentBoard = new ArrayList<>();
            for (String[] r : board) {
                currentBoard.add(String.join("", r));
            }
            ans.add(currentBoard);
            return; 
        }
        for(int i=0;i<n;i++){
        if(isSafe(board,row,i,n)){
           board[row][i]="Q";
           nQueens(board,row+1,n,ans);
           board[row][i]=".";
        }
      }
    }
     
    public List<List<String>> solveNQueens(int n) {
        String[][] board=new String[n][n];
        for (String[] row : board) {
            Arrays.fill(row, "."); 
        }
        List<List<String>> ans=new ArrayList<>();
    nQueens(board,0, n, ans);
    return ans;
    }
}