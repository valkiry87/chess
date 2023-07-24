package chess.figures;

import chess.coordinates.ChessCoordinates;

public class WhiteBishop extends ChessFigure{
    public boolean checkNewCoordinates(String startPosition, String newPosition) {
        ChessCoordinates startCoordinates = ChessCoordinates.forChess(startPosition);
        int startX = startCoordinates.getX();
        int startY = startCoordinates.getY();

        ChessCoordinates newCoordinates = ChessCoordinates.forChess(newPosition);

        if (!newPosition.equals(startPosition)) {
            if (newCoordinates.xMoreOrEquals (0) && newCoordinates.xLessOrEquals (7)
                    && newCoordinates.yMoreOrEquals (0) && newCoordinates.yLessOrEquals(7)) {
                for (int i = 1; i <= 7; i++) {
                    if ((newCoordinates.xEquals (startX - i)) && (newCoordinates.yEquals (startY - i)))
                        return true;
                    if ((newCoordinates.xEquals (startX + i)) && (newCoordinates.yEquals (startY + i)))
                        return true;
                    if ((newCoordinates.xEquals (startX - i)) && (newCoordinates.yEquals (startY + i)))
                        return true;
                    if ((newCoordinates.xEquals (startX + i)) && (newCoordinates.yEquals (startY - i)))
                        return true;
                }
            }
        }
        return false;
    }
}