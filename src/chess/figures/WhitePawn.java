package chess.figures;

import chess.coordinates.ChessCoordinates;

public class WhitePawn extends ChessFigure {
    public boolean checkNewCoordinates(String startPosition, String newPosition) {
        ChessCoordinates startCoordinates = ChessCoordinates.forChess(startPosition);
        int startX = startCoordinates.getX();
        int startY = startCoordinates.getY();

        ChessCoordinates newCoordinates = ChessCoordinates.forChess(newPosition);
        int newX = newCoordinates.getX();
        int newY = newCoordinates.getY();

        if (!newPosition.equals(startPosition)) {
            if (newX >= 0 && newX <= 7 && newY >= 2 && newY <= 7) {
                if (startY == 1 && newX == startX && (newY == startY+1 || newY == startY+2))
                    return true;
                return newX == startX && newY == startY + 1;
            } else return false;
        } else return false;
    }
}
