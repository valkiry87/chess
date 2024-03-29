package chess.coordinates;

public class ChessCoordinates {
    private final int x;
    private final int y;

    public static ChessCoordinates forNumerical(int x, int y) {
        return new ChessCoordinates(x, y);
    }

    public static ChessCoordinates forChess(String pos) {
        return new ChessCoordinates(pos.charAt(0) - 'a', pos.charAt(1) - '1');
    }

    private ChessCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getChess() {
        return new String(new int[]{'a' + x, '1' + y}, 0, 2);
    }

    public boolean xEquals (int newValue) { return this.x == newValue;}
    public boolean yEquals (int newValue) { return this.y == newValue;}

    public boolean xMoreOrEquals (int newValue) { return this.x >= newValue;}
    public boolean yMoreOrEquals (int newValue) { return this.y >= newValue;}

    public boolean xLessOrEquals (int newValue) { return this.x <= newValue;}
    public boolean yLessOrEquals (int newValue) { return this.y <= newValue;}
}
