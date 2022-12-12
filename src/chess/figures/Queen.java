package chess.figures;

import chess.coordinates.ChessCoordinates;
import chess.figures.ChessFigure;

public class Queen extends ChessFigure {
    public boolean checkNewCoordinates(String newPosition) {
        ChessCoordinates newCoordinates = ChessCoordinates.forChess(newPosition);
        int x = newCoordinates.getX();
        int y = newCoordinates.getY();
        if (x >= 0 && x <= 7 && y >= 0 && y <= 7) {
            return true;
        } else return false;
    }
}
