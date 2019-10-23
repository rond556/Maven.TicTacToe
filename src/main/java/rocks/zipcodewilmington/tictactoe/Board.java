package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Board(Character[][] matrix) {

        Character[][] board = new matrix;
    }

    public TicTacToeBoard(Character victorySymbol) {
        Board[][] board = new Board[][];
        Character xOrO = victorySymbol;
        //horizontal victory
        if (board[0][0].equals(xOrO) && board[0][1].equals(xOrO) && board[0][2].equals(xOrO))
            return true;
        else if (board[1][0].equals(xOrO) && board[1][1].equals(xOrO) && board[1][2].equals(xOrO))
            return true;
        else if (board[2][0].equals(xOrO) && board[2][1].equals(xOrO) && board[2][2].equals(xOrO))
            return true;
            //vertical victory
        else if (board[0][0].equals(xOrO) && board[1][0].equals(xOrO) && board[2][0].equals(xOrO))
            return true;
        else if (board[1][0].equals(xOrO) && board[1][1].equals(xOrO) && board[2][1].equals(xOrO))
            return true;
        else if (board[0][2].equals(xOrO) && board[1][2].equals(xOrO) && board[2][2].equals(xOrO))
            return true;
            //diagonal victory
        else if (board[0][0].equals(xOrO) && board[1][1].equals(xOrO) && board[2][2].equals(xOrO))
            return true;
        else if (board[0][2].equals(xOrO) && board[1][1].equals(xOrO) && board[2][0].equals(xOrO))
            return true;
        else
            return false;
    }



    public Boolean isInFavorOfX() {

        }
    }
    
    

    public Boolean isInFavorOfO() {

            
    }

    public Boolean isTie() {
        Board[][] board = new Board[][];

        }
    }

    public String getWinner() {
        return null;
    }

}
