public class TextHexMines {
    
    public static String[][] createBoard (int boardSize) {
        String [][] board = new String[boardSize][boardSize];
        for (int i = board.length/4; i < (board.length - board.length/4); i++) {
            if (i < board.length/2) {
                for (int j = 0; j < board.length; j++) {
                    
                    if (j < (board.length/2 - i)) {
                        board[i][j] = " ";
                    }
                    else if (j > (board.length/2 - i)  && j < (board.length/2 + i)) {
                         board[i][j] = "c";
                    }
                    else {
                        board[i][j] = " ";
                    }
                     
                }
            }
            else if(i == board.length/2) {
                for (int j = 0; j < board.length; j++) {
                        board[i][j] = "c";
                    }    
                }
            else {
                
                 for (int j = 0; j < board.length; j++) {
                       if (j < (board.length/2 - (board.length - (i)))) {
                           board[i][j] = " ";
                       }
                      else if (j < (board.length/2 + (board.length - (i)))) {
                           board[i][j] = "c";
                       }
                     else {
                         board[i][j] = " ";
                     }
                    }
                
            }
        }
        
        return board;
                        
    }
                         
    
    public static void printBoard (String [][] inputBoard) {
        
        for (int i = 0; i < inputBoard.length; i++) {
            String rs = "";
            for (int j = 0; j < inputBoard[i].length; j++) {
                if (inputBoard[i][j] != null) {
                    rs = rs + inputBoard[i][j];
                }
            }
            System.out.println(rs);
        }
    }
    
    
    public static void main(String [] args) {
        printBoard(createBoard(30));
    }
}