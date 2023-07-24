package chess.figures;

import chess.coordinates.ChessCoordinates;

import static chess.coordinates.ChessCoordinates.forChess;

public class BlackKnight extends ChessFigure{
    public boolean checkNewCoordinates(String startPosition, String newPosition) {
        ChessCoordinates startCoordinates = forChess(startPosition);
        int startX = startCoordinates.getX();
        int startY = startCoordinates.getY();

        ChessCoordinates newCoordinates = forChess(newPosition);

        if (!newPosition.equals(startPosition)) {
            if (newCoordinates.xMoreOrEquals (0) && newCoordinates.xLessOrEquals (7)
                    && newCoordinates.yMoreOrEquals (0) && newCoordinates.yLessOrEquals(7)) {
                if ((newCoordinates.xEquals (startX - 1) || newCoordinates.xEquals (startX + 1)) && (newCoordinates.yEquals (startY + 2)))
                    return true;
                if ((newCoordinates.xEquals (startX + 2)) && (newCoordinates.yEquals (startY + 1) || newCoordinates.yEquals (startY - 1)))
                    return true;
                if ((newCoordinates.xEquals (startX - 1) || newCoordinates.xEquals (startX + 1)) && (newCoordinates.yEquals (startY - 2)))
                    return true;
                return (newCoordinates.xEquals(startX - 2)) && (newCoordinates.yEquals(startY + 1) || newCoordinates.yEquals(startY - 1));
                } else return false;
            } else return false;
    }
}
