package chess;

import chess.figures.*;

public class Main {
    public static void main(String[] args) {
    }
    public static ChessFigure setFigure(String figure)
    {
        ChessFigure chessFigure = new ChessFigure();
        switch (figure) {
            case "White King" -> chessFigure = new WhiteKing();
            case "White Queen" -> chessFigure = new WhiteQueen();
            case "White Rook" -> chessFigure = new WhiteRook();
            case "White Bishop" -> chessFigure = new WhiteBishop();
            case "White Knight" -> chessFigure = new WhiteKnight();
            case "White Pawn" -> chessFigure = new WhitePawn();
            case "Black King" -> chessFigure = new BlackKing();
            case "Black Queen" -> chessFigure = new BlackQueen();
            case "Black Rook" -> chessFigure = new BlackRook();
            case "Black Bishop" -> chessFigure = new BlackBishop();
            case "Black Knight" -> chessFigure = new BlackKnight();
            case "Black Pawn" -> chessFigure = new BlackPawn();
            default -> {
                System.out.println("Es gibt keine " + figure + " als Figur.");
                System.exit(0);
            }
        }
        return chessFigure;
    }
}
