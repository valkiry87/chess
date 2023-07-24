package chess.figures;

import chess.coordinates.ChessCoordinates;

public class BlackRook extends ChessFigure {
    public boolean checkNewCoordinates(String startPosition, String newPosition) {
        ChessCoordinates startCoordinates = ChessCoordinates.forChess(startPosition);
        int startX = startCoordinates.getX();
        int startY = startCoordinates.getY();

        ChessCoordinates newCoordinates = ChessCoordinates.forChess(newPosition);

        if (!newPosition.equals(startPosition)) {
            if (newCoordinates.xMoreOrEquals (0) && newCoordinates.xLessOrEquals (7)
                    && newCoordinates.yMoreOrEquals (0) && newCoordinates.yLessOrEquals(7)) {
                return (newCoordinates.xEquals(startX) || newCoordinates.yEquals(startY));
            } else return false;
        } else return false;
    }
}