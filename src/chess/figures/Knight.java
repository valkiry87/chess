package chess.figures;

import chess.coordinates.ChessCoordinates;

public class Knight extends ChessFigure{
    public boolean checkNewCoordinates(String startPosition, String newPosition) {
        ChessCoordinates startCoordinates = ChessCoordinates.forChess(startPosition);
        int startX = startCoordinates.getX();
        int startY = startCoordinates.getY();

        ChessCoordinates newCoordinates = ChessCoordinates.forChess(newPosition);
        int newX = newCoordinates.getX();
        int newY = newCoordinates.getY();

        if (!newPosition.equals(startPosition)) {
            if (newX >= 0 && newX <= 7 && newY >= 0 && newY <= 7) {
                if ((newY == (startY + 2)) && (newX == (startX - 1) || newX == (startX + 1)))
                    return true;
                if ((newY == (startY + 1) || newY == (startY - 1)) && (newX == (startX + 2)))
                    return true;
                if ((newY == (startY - 2)) && (newX == (startX - 1) || newX == (startX + 1)))
                    return true;
                if ((newY == (startY + 1) || newY == (startY - 1)) && (newX == (startX - 2)))
                    return true;
                } else return false;
            } else return false;
        return false;
    }
}
