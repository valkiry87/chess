package test;
import org.testng.annotations.Test;

import static chess.figures.ChessFigure.checkNewPosition;
import static chess.Main.setFigure;
import static org.testng.AssertJUnit.assertEquals;

public class JUnitTest {
    @Test
    void KingPositiveTest() {
        assertEquals(checkNewPosition(setFigure("King"), "e1", "d1"), true);
        assertEquals(checkNewPosition(setFigure("King"), "e1", "d2"), true);
        assertEquals(checkNewPosition(setFigure("King"), "e1", "e2"), true);
        assertEquals(checkNewPosition(setFigure("King"), "e1", "f1"), true);
        assertEquals(checkNewPosition(setFigure("King"), "e1", "f2"), true);
    }

    @Test
    void KingNegativeTest() {
        assertEquals(checkNewPosition(setFigure("King"),"e1","a1"), false);
        assertEquals(checkNewPosition(setFigure("King"),"e1","e0"), false);
        assertEquals(checkNewPosition(setFigure("King"),"e1","d3"), false);
        assertEquals(checkNewPosition(setFigure("King"),"e1","e1"), false);
    }

    @Test
    void QueenPositiveTest() {
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "a1"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "b1"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "c1"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "e1"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "f1"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "g1"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "h1"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "d2"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "d3"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "d4"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "d5"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "d6"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "d7"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "d8"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "e2"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "f3"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "g4"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "h5"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "c2"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "b3"), true);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "a4"), true);
    }

    @Test
    void QueenNegativeTest() {
        assertEquals(checkNewPosition(setFigure("Queen"),"d1","c3"), false);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1","d1"), false);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "f2"), false);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "d0"), false);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "h8"), false);
        assertEquals(checkNewPosition(setFigure("Queen"),"d1", "b7"), false);
    }

    @Test
    void PawnPositiveTest() {
      //  assertEquals(checkNewPosition(setFigure("Pawn"), "a2", "a3"), true);
        assertEquals(checkNewPosition(setFigure("Pawn"), "a2", "a4"), true);
        assertEquals(checkNewPosition(setFigure("Pawn"), "b2", "b3"), true);
        assertEquals(checkNewPosition(setFigure("Pawn"), "h2", "h4"), true);
    }

    @Test
    void PawnNegativeTest() {
        assertEquals(checkNewPosition(setFigure("Pawn"),"a2","a1"), false);
        assertEquals(checkNewPosition(setFigure("Pawn"),"a2","b1"), false);
        assertEquals(checkNewPosition(setFigure("Pawn"),"a2","b3"), false);
        assertEquals(checkNewPosition(setFigure("Pawn"),"a2","a2"), false);
    }
}
