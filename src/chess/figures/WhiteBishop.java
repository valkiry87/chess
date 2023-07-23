package chess.figures;

import chess.coordinates.ChessCoordinates;

public class WhiteBishop extends ChessFigure{
    public boolean checkNewCoordinates(String startPosition, String newPosition) {
        ChessCoordinates startCoordinates = ChessCoordinates.forChess(startPosition);
        int startX = startCoordinates.getX();
        int startY = startCoordinates.getY();

        ChessCoordinates newCoordinates = ChessCoordinates.forChess(newPosition);
        int newX = newCoordinates.getX();
        int newY = newCoordinates.getY();

        if (!newPosition.equals(startPosition)) {
            if (newX >= 0 && newX <= 7 && newY >= 0 && newY <= 7) {
                    for (int i = 1; i <= 7; i++) {
                        if ((newX == (startX - i)) && (newY == (startY - i)))
                            return true;
                        if ((newX == (startX + i)) && (newY == (startY + i)))
                            return true;
                        if ((newX == (startX - i)) && (newY == (startY + i)))
                            return true;
                        if ((newX == (startX + i)) && (newY == (startY - i)))
                            return true;
                    }
                    return false;
            } else return false;
        } else return false;
    }
}
