package chess.figures;

public class ChessFigure {

    public static boolean checkNewPosition (ChessFigure figure, String newPosition) {

        if(figure.checkNewCoordinates(newPosition))
        {
            System.out.println("Korrekte Bewegung");
            return true;
        }
        else System.out.println("Dieser Schritt ist nicht möglich");
        return false;
    }

    public boolean checkNewCoordinates(String newPosition) {
        return false;
    }
}
