package chess.coordinates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChessCoordinates2Test {
    @Test
    public void testForNumerical() {
        ChessCoordinates2 toTest = ChessCoordinates2.forNumerical(3, 4);
        assertEquals(3, toTest.getX());
        assertEquals(4, toTest.getY());
        assertEquals("d5", toTest.getChess());
    }

    @Test
    public void testForChess() {
        ChessCoordinates2 toTest = ChessCoordinates2.forChess("d5");
        assertEquals(3, toTest.getX());
        assertEquals(4, toTest.getY());
        assertEquals("d5", toTest.getChess());
    }
}