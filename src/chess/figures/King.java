package chess.figures;

import chess.coordinates.ChessCoordinates;

import java.util.Arrays;

public class King extends ChessFigure {
    private int startX = 4;
    private int startY = 0;
    private int[] availableX = new int[]{startX - 1, startX, startX + 1};
    private int[] availableY = new int[]{startY - 1, startY, startY + 1};

    public boolean checkNewCoordinates(String newPosition) {
        ChessCoordinates newCoordinates = ChessCoordinates.forChess(newPosition);
        int x = newCoordinates.getX();
        int y = newCoordinates.getY();
        if (x >= 0 && x <= 7 && y >= 0 && y <= 7) {
            if (Arrays.stream(availableX).anyMatch(e -> e == x)) {
                if (Arrays.stream(availableY).anyMatch(e -> e == y)) {
                    return true;
                }
                else return false;
            } else return false;
        }
        else return false;
    }
}