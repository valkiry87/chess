package chess.coordinates;

public class ChessCoordinates2 {
    private final String pos;

    public static ChessCoordinates2 forNumerical(int x, int y) {
        return new ChessCoordinates2(new String(new int[]{'a' + x, '1' + y}, 0, 2));
    }

    public static ChessCoordinates2 forChess(String pos) {
        return new ChessCoordinates2(pos);
    }

    public ChessCoordinates2(String pos) {
        this.pos = pos;
    }

    public int getX() {
        return pos.charAt(0) - 'a';
    }

    public int getY() {
        return pos.charAt(1) - '1';
    }

    public String getChess() {
        return pos;
    }
}
