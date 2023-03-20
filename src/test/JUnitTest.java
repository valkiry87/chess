package test;
import org.testng.annotations.Test;

import static chess.figures.ChessFigure.checkNewPosition;
import static chess.Main.setFigure;
import static org.testng.AssertJUnit.*;

public class JUnitTest {
    @Test
    void KingPositiveTest() {
        assertTrue(checkNewPosition(setFigure("King"), "e1", "d1"));
        assertTrue(checkNewPosition(setFigure("King"), "e1", "d2"));
        assertTrue(checkNewPosition(setFigure("King"), "e1", "e2"));
        assertTrue(checkNewPosition(setFigure("King"), "e1", "f1"));
        assertTrue(checkNewPosition(setFigure("King"), "e1", "f2"));
    }

    @Test
    void KingNegativeTest() {
        assertFalse(checkNewPosition(setFigure("King"), "e1", "a1"));
        assertFalse(checkNewPosition(setFigure("King"), "e1", "e0"));
        assertFalse(checkNewPosition(setFigure("King"), "e1", "d3"));
        assertFalse(checkNewPosition(setFigure("King"), "e1", "e1"));
    }

    @Test
    void QueenPositiveTest() {
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "a1"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "b1"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "c1"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "e1"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "f1"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "g1"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "h1"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "d2"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "d3"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "d4"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "d5"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "d6"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "d7"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "d8"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "e2"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "f3"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "g4"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "h5"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "c2"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "b3"));
        assertTrue(checkNewPosition(setFigure("Queen"), "d1", "a4"));
    }

    @Test
    void QueenNegativeTest() {
        assertFalse(checkNewPosition(setFigure("Queen"), "d1", "c3"));
        assertFalse(checkNewPosition(setFigure("Queen"), "d1", "d1"));
        assertFalse(checkNewPosition(setFigure("Queen"), "d1", "f2"));
        assertFalse(checkNewPosition(setFigure("Queen"), "d1", "d0"));
        assertFalse(checkNewPosition(setFigure("Queen"), "d1", "h8"));
        assertFalse(checkNewPosition(setFigure("Queen"), "d1", "b7"));
    }

    @Test
    void PawnPositiveTest() {
      //  assertEquals(checkNewPosition(setFigure("Pawn"), "a2", "a3"), true);
        assertTrue(checkNewPosition(setFigure("Pawn"), "a2", "a4"));
        assertTrue(checkNewPosition(setFigure("Pawn"), "b2", "b3"));
        assertTrue(checkNewPosition(setFigure("Pawn"), "h2", "h4"));
    }

    @Test
    void PawnNegativeTest() {
        assertFalse(checkNewPosition(setFigure("Pawn"), "a2", "a1"));
        assertFalse(checkNewPosition(setFigure("Pawn"), "a2", "b1"));
        assertFalse(checkNewPosition(setFigure("Pawn"), "a2", "b3"));
        assertFalse(checkNewPosition(setFigure("Pawn"), "a2", "a2"));
    }

    @Test
    void RookPositiveTest() {
        assertTrue(checkNewPosition(setFigure("Rook"), "a1", "d1"));
        assertTrue(checkNewPosition(setFigure("Rook"), "a1", "b1"));
        assertTrue(checkNewPosition(setFigure("Rook"), "a1", "c1"));
        assertTrue(checkNewPosition(setFigure("Rook"), "a1", "e1"));
        assertTrue(checkNewPosition(setFigure("Rook"), "a1", "f1"));
        assertTrue(checkNewPosition(setFigure("Rook"), "a1", "g1"));
        assertTrue(checkNewPosition(setFigure("Rook"), "a1", "h1"));
        assertTrue(checkNewPosition(setFigure("Rook"), "a1", "a2"));
        assertTrue(checkNewPosition(setFigure("Rook"), "a1", "a3"));
        assertTrue(checkNewPosition(setFigure("Rook"), "a1", "a4"));
        assertTrue(checkNewPosition(setFigure("Rook"), "a1", "a5"));
        assertTrue(checkNewPosition(setFigure("Rook"), "a1", "a6"));
        assertTrue(checkNewPosition(setFigure("Rook"), "a1", "a7"));
        assertTrue(checkNewPosition(setFigure("Rook"), "a1", "a8"));
    }

    @Test
    void RookNegativeTest() {
        assertFalse(checkNewPosition(setFigure("Rook"), "a1", "b2"));
        assertFalse(checkNewPosition(setFigure("Rook"), "a1", "a1"));
        assertFalse(checkNewPosition(setFigure("Rook"), "a1", "f2"));
        assertFalse(checkNewPosition(setFigure("Rook"), "a1", "a0"));
        assertFalse(checkNewPosition(setFigure("Rook"), "a1", "h8"));
        assertFalse(checkNewPosition(setFigure("Rook"), "a1", "b7"));
    }

    @Test
    void BishopPositiveTest() {
        assertTrue(checkNewPosition(setFigure("Bishop"), "c1", "b2"));
        assertTrue(checkNewPosition(setFigure("Bishop"), "c1", "a3"));
        assertTrue(checkNewPosition(setFigure("Bishop"), "c1", "d2"));
        assertTrue(checkNewPosition(setFigure("Bishop"), "c1", "e3"));
        assertTrue(checkNewPosition(setFigure("Bishop"), "c1", "f4"));
        assertTrue(checkNewPosition(setFigure("Bishop"), "c1", "g5"));
        assertTrue(checkNewPosition(setFigure("Bishop"), "c1", "h6"));
        assertTrue(checkNewPosition(setFigure("Bishop"), "f1", "g2"));
        assertTrue(checkNewPosition(setFigure("Bishop"), "f1", "h3"));
        assertTrue(checkNewPosition(setFigure("Bishop"), "f1", "e2"));
        assertTrue(checkNewPosition(setFigure("Bishop"), "f1", "d3"));
        assertTrue(checkNewPosition(setFigure("Bishop"), "f1", "c4"));
        assertTrue(checkNewPosition(setFigure("Bishop"), "f1", "b5"));
        assertTrue(checkNewPosition(setFigure("Bishop"), "f1", "a6"));
    }

    @Test
    void BishopNegativeTest() {
        assertFalse(checkNewPosition(setFigure("Bishop"), "c1", "c0"));
        assertFalse(checkNewPosition(setFigure("Bishop"), "c1", "c1"));
        assertFalse(checkNewPosition(setFigure("Bishop"), "c1", "b1"));
        assertFalse(checkNewPosition(setFigure("Bishop"), "f1", "f0"));
        assertFalse(checkNewPosition(setFigure("Bishop"), "f1", "h8"));
        assertFalse(checkNewPosition(setFigure("Bishop"), "f1", "b7"));
    }

    @Test
    void KnightPositiveTest() {
        assertTrue(checkNewPosition(setFigure("Knight"), "b1", "a3"));
        assertTrue(checkNewPosition(setFigure("Knight"), "b1", "c3"));
        assertTrue(checkNewPosition(setFigure("Knight"), "b1", "d2"));
        assertTrue(checkNewPosition(setFigure("Knight"), "g1", "f3"));
        assertTrue(checkNewPosition(setFigure("Knight"), "g1", "e2"));
        assertTrue(checkNewPosition(setFigure("Knight"), "g1", "h3"));
    }

    @Test
    void KnightNegativeTest() {
        assertFalse(checkNewPosition(setFigure("Knight"), "b1", "b1"));
        assertFalse(checkNewPosition(setFigure("Knight"), "b1", "a1"));
        assertFalse(checkNewPosition(setFigure("Knight"), "b1", "e0"));
        assertFalse(checkNewPosition(setFigure("Knight"), "g1", "d3"));
        assertFalse(checkNewPosition(setFigure("Knight"), "g1", "g1"));
    }
}
