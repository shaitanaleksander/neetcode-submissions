class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<Character>[] tiles  = new HashSet[9];
        Set<Character> row = new HashSet<>();
        Set<Character> col = new HashSet<>();

        for(int i = 0; i < 9; i++) tiles[i] = new HashSet<Character>();

        for(int i = 0; i < 9; i++){

            for(int j = 0; j < 9; j++){
                

                if (board[i][j] != '.' && !row.add(board[i][j])) return false;
                
                if(board[j][i] !='.' && !col.add(board[j][i])) return false;

                int position = (i / 3) * 3 + (j / 3);
                
                if(board[i][j] != '.' && !(tiles[position].add(board[i][j]))) return false;

            }
            row = new HashSet<>();
            col = new HashSet<>();
        }

        return true;
    }
}
