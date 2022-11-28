package chess;

public class ChessBoard {
   // final public char[][] chessBoard = new char[][]{{'a','b','c','d','e','f','g','h'},{'1', '2', '3','4','5','6','7','8'}};

    public char[][] getChessBoardPosition(char l, char n) {
        int x =  l -97;
        int y =  n-49;
        char[][] position = new char[x][y];
        return position;
    }
}
