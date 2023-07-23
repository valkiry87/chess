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

    public static boolean intEquals(Object other) {
        return (other instanceof Integer aInteger);
    }

/*
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        return (anObject instanceof String aString)
                && (!COMPACT_STRINGS || this.coder == aString.coder)
                && StringLatin1.equals(value, aString.value);
    }*/
}
