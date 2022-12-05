package chess;

public class King extends ChessFigure{
    int[][] startPosition = new int[][]{{4},{0}};
    int[][] availablePositions = new int[][]{{3,4,5},{0,1}};

    public int[][] getStartPosition() {
        return startPosition;
    }

    public int[][] getAvailablePositions() {
        return availablePositions;
    }
}
