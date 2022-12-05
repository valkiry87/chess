package chess;

import java.util.Arrays;

public class ChessFigure {
    private int[][] availablePositions;

    public static void checkNewPosition (ChessFigure figure, int[][] newPosition) {
        if(Arrays.stream(figure.availablePositions).toList().contains(newPosition))
        {
            System.out.println("Korrekte Bewegung");
        }
        else System.out.println("Dieser Schritt ist nicht möglich");
    }

}
