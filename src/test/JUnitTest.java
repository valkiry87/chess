package test;
import org.testng.annotations.Test;

import static chess.figures.ChessFigure.checkNewPosition;
import static chess.Main.setFigure;
import static org.testng.AssertJUnit.assertEquals;

public class JUnitTest {
    @Test
    void KingPositiveTest() {
        assertEquals(checkNewPosition(setFigure("King"), "f2"), true);
    }

    @Test
    void KingNegativeTest() {
        assertEquals(checkNewPosition(setFigure("King"),"a1"), false);
    }

    @Test
    void QueenPositiveTest() {
        assertEquals(checkNewPosition(setFigure("Queen"), "a1"), true);
    }

    @Test
    void QueenNegativeTest() {
        assertEquals(checkNewPosition(setFigure("Queen"),"a0"), false);
    }
}
