package chess;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
    }

    public static int[][] setPosition(String position)
    {
        List<Character> chars = new ArrayList<>();
        for (char ch : position.toCharArray()) {
            chars.add(ch);
        }
        ChessBoard chessBoard = new ChessBoard();
        return chessBoard.getChessBoardPosition(chars.get(0), chars.get(1));
    }
    public static ChessFigure setFigure(String figure)
    {
        ChessFigure chessFigur = new ChessFigure();
        switch (figure) {
            case "King" -> chessFigur = new King();
            case "Queen" -> chessFigur = new Queen();
            case "Rook" -> chessFigur = new Rook();
            case "Bishop" -> chessFigur = new Bishop();
            case "Knight" -> chessFigur = new Knight();
            case "Pawn" -> chessFigur = new Pawn();
            default -> {
                System.out.println("Es gibt keine " + figure + " als Figur.");
                System.exit(0);
            }
        }
        return chessFigur;
    }
}
