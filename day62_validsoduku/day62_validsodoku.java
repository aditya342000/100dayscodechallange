class Solution {
    Set<String>s=new HashSet<>();
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
               
                if(board[i][j]!='.'){
                   String x="("+board[i][j]+")";
                   if (!s.add(x + i) || !s.add(j + x) || !s.add(i/3 + x + j/3))
                    return false;
                        
                }
            }
        }
        return true;
    }
   
}
