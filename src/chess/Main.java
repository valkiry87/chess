package chess;

import chess.figures.*;

public class Main {
    public static void main(String[] args) {
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
