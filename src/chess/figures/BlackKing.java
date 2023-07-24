package chess.figures;

import chess.coordinates.ChessCoordinates;

import java.util.Arrays;

public class BlackKing extends ChessFigure {
    public boolean checkNewCoordinates(String startPosition, String newPosition) {
        ChessCoordinates startCoordinates = ChessCoordinates.forChess(startPosition);
        int startX = startCoordinates.getX();
        int startY = startCoordinates.getY();
        int[] availableX = new int[]{startX - 1, startX, startX + 1};
        int[] availableY = new int[]{startY - 1, startY, startY + 1};

        ChessCoordinates newCoordinates = ChessCoordinates.forChess(newPosition);
        int x = newCoordinates.getX();
        int y = newCoordinates.getY();
        if (!newPosition.equals(startPosition)) {
            if (newCoordinates.xMoreOrEquals (0) && newCoordinates.xLessOrEquals (7)
                    && newCoordinates.yMoreOrEquals (0) && newCoordinates.yLessOrEquals(7)) {
                if (Arrays.stream(availableX).anyMatch(e -> e == x)) {
                    return Arrays.stream(availableY).anyMatch(e -> e == y);
                } else return false;
            } else return false;
        } else return false;
    }
}