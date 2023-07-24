package chess.figures;

import chess.coordinates.ChessCoordinates;

public class BlackPawn extends ChessFigure {
    public boolean checkNewCoordinates(String startPosition, String newPosition) {
        ChessCoordinates startCoordinates = ChessCoordinates.forChess(startPosition);
        int startX = startCoordinates.getX();
        int startY = startCoordinates.getY();

        ChessCoordinates newCoordinates = ChessCoordinates.forChess(newPosition);

        if (!newPosition.equals(startPosition)) {
            if (newCoordinates.xMoreOrEquals (0) && newCoordinates.xLessOrEquals (7)
                    && newCoordinates.yMoreOrEquals (2) && newCoordinates.yLessOrEquals(7)) {
                if (startCoordinates.yEquals (6) && newCoordinates.xEquals (startX) &&
                        (newCoordinates.yEquals (startY-1) || (newCoordinates.yEquals ( startY-2))))
                    return true;
                return newCoordinates.xEquals (startX) && newCoordinates.yEquals (startY - 1);
            } else return false;
        } else return false;
    }
}
