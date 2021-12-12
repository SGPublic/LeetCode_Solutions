package daily.Y2021.Dec.Dec09_ValidTicTacToeState;

class Solution {
    public boolean validTicTacToe(String[] board) {
        int x = 0, o = 0;
        for (String line : board){
            for (char c : line.toCharArray()) {
                switch(c){
                    case 'X':
                        x++;
                        break;
                    case 'O':
                        o++;
                        break;
                }
            }
        }
        if (x - o > 1 || o > x){
            return false;
        }
        if (x < 3){
            return true;
        }
        boolean winX = win(board, 'X');
        boolean winO = win(board, 'O');
        if (!winO && !winX){
            return true;
        }
        if (winO && winX){
            return false;
        }
        if (winX && x - o == 1){
            return true;
        }
        if (winO && x == o){
            return true;
        }
        return false;
    }

    private static final int[][][] wins = {
            {
                    { 0, 0 }, { 1, 0 }, { 2, 0 }
            },
            {
                    { 0, 1 }, { 1, 1 }, { 2, 1 }
            },
            {
                    { 0, 2 }, { 1, 2 }, { 2, 2 }
            },
            {
                    { 0, 0 }, { 0, 1 }, { 0, 2 }
            },
            {
                    { 1, 0 }, { 1, 1 }, { 1, 2 }
            },
            {
                    { 2, 0 }, { 2, 1 }, { 2, 2 }
            },
            {
                    { 0, 0 }, { 1, 1 }, { 2, 2 }
            },
            {
                    { 2, 0 }, { 1, 1 }, { 0, 2 }
            }
    };
    private boolean win(String[] board, char c){
        pointFor: for (int[][] winCase : wins){
            for (int i = 0; i < 3; i++){
                int[] point = winCase[i];
                if (board[point[0]].charAt(point[1]) != c){
                    continue pointFor;
                }
            }
            return true;
        }
        return false;
    }
}