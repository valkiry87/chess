package test;

import org.junit.jupiter.api.Test;

import static chess.ChessFigure.checkNewPosition;
import static chess.Main.setFigure;
import static chess.Main.setPosition;

public class JUnitTest {
    @Test
    void KingPositiveTest() {
        checkNewPosition(setFigure("King"),setPosition("e2"));
    }

    @Test
    void KingNegativeTest() {
        checkNewPosition(setFigure("King"),setPosition("a1"));
    }
}
