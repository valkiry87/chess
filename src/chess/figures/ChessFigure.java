package chess.figures;

public class ChessFigure {

    public static boolean checkNewPosition (ChessFigure figure, String startPosition, String newPosition) {

        if(figure.checkNewCoordinates(startPosition, newPosition))
        {
            System.out.println("Korrekte Bewegung");
            return true;
        }
        else System.out.println("Dieser Schritt ist nicht möglich");
        return false;
    }

    public boolean checkNewCoordinates(String startPosition, String newPosition) {
        return false;
    }
}
