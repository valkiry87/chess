package test;

import chess.coordinates.ChessCoordinates;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class ChessCoordinatesTest {
    @Test
    public void testForNumerical() {
        ChessCoordinates toTest = ChessCoordinates.forNumerical(3, 4);
        assertEquals(3, toTest.getX());
        assertEquals(4, toTest.getY());
        assertEquals("d5", toTest.getChess());
    }

    @Test
    public void testForChess() {
        ChessCoordinates toTest = ChessCoordinates.forChess("d5");
        assertEquals(3, toTest.getX());
        assertEquals(4, toTest.getY());
        assertEquals("d5", toTest.getChess());
    }
}