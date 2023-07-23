package test;
import org.testng.annotations.Test;

import static chess.figures.ChessFigure.checkNewPosition;
import static chess.Main.setFigure;
import static chess.figures.FiguresEnum.*;
import static org.testng.AssertJUnit.*;

public class JUnitTest {
    @Test
    void WhiteKingPositiveTest() {
        assertTrue(checkNewPosition(setFigure(WHITE_KING.name()), "e1", "d1"));
        assertTrue(checkNewPosition(setFigure(WHITE_KING.name()), "e1", "d2"));
        assertTrue(checkNewPosition(setFigure(WHITE_KING.name()), "e1", "e2"));
        assertTrue(checkNewPosition(setFigure(WHITE_KING.name()), "e1", "f1"));
        assertTrue(checkNewPosition(setFigure(WHITE_KING.name()), "e1", "f2"));
    }

    @Test
    void WhiteKingNegativeTest() {
        assertFalse(checkNewPosition(setFigure(WHITE_KING.name()), "e1", "a1"));
        assertFalse(checkNewPosition(setFigure(WHITE_KING.name()), "e1", "e0"));
        assertFalse(checkNewPosition(setFigure(WHITE_KING.name()), "e1", "d3"));
        assertFalse(checkNewPosition(setFigure(WHITE_KING.name()), "e1", "e1"));
    }

    @Test
    void WhiteQueenPositiveTest() {
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "a1"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "b1"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "c1"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "e1"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "f1"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "g1"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "h1"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "d2"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "d3"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "d4"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "d5"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "d6"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "d7"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "d8"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "e2"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "f3"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "g4"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "h5"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "c2"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "b3"));
        assertTrue(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "a4"));
    }

    @Test
    void WhiteQueenNegativeTest() {
        assertFalse(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "c3"));
        assertFalse(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "d1"));
        assertFalse(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "f2"));
        assertFalse(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "d0"));
        assertFalse(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "h8"));
        assertFalse(checkNewPosition(setFigure(WHITE_QUEEN.name()), "d1", "b7"));
    }

    @Test
    void WhitePawnPositiveTest() {
        assertTrue(checkNewPosition(setFigure(WHITE_PAWN.name()), "a2", "a4"));
        assertTrue(checkNewPosition(setFigure(WHITE_PAWN.name()), "b2", "b3"));
        assertTrue(checkNewPosition(setFigure(WHITE_PAWN.name()), "h2", "h4"));
    }

    @Test
    void WhitePawnNegativeTest() {
        assertFalse(checkNewPosition(setFigure(WHITE_PAWN.name()), "a2", "a1"));
        assertFalse(checkNewPosition(setFigure(WHITE_PAWN.name()), "a2", "b1"));
        assertFalse(checkNewPosition(setFigure(WHITE_PAWN.name()), "a2", "b3"));
        assertFalse(checkNewPosition(setFigure(WHITE_PAWN.name()), "a2", "a2"));
        assertFalse(checkNewPosition(setFigure(WHITE_PAWN.name()), "a8", "a9"));
    }

    @Test
    void WhiteRookPositiveTest() {
        assertTrue(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "d1"));
        assertTrue(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "b1"));
        assertTrue(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "c1"));
        assertTrue(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "e1"));
        assertTrue(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "f1"));
        assertTrue(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "g1"));
        assertTrue(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "h1"));
        assertTrue(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "a2"));
        assertTrue(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "a3"));
        assertTrue(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "a4"));
        assertTrue(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "a5"));
        assertTrue(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "a6"));
        assertTrue(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "a7"));
        assertTrue(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "a8"));
    }

    @Test
    void WhiteRookNegativeTest() {
        assertFalse(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "b2"));
        assertFalse(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "a1"));
        assertFalse(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "f2"));
        assertFalse(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "a0"));
        assertFalse(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "h8"));
        assertFalse(checkNewPosition(setFigure(WHITE_ROOK.name()), "a1", "b7"));
    }

    @Test
    void WhiteBishopPositiveTest() {
        assertTrue(checkNewPosition(setFigure(WHITE_BISHOP.name()), "c1", "b2"));
        assertTrue(checkNewPosition(setFigure(WHITE_BISHOP.name()), "c1", "a3"));
        assertTrue(checkNewPosition(setFigure(WHITE_BISHOP.name()), "c1", "d2"));
        assertTrue(checkNewPosition(setFigure(WHITE_BISHOP.name()), "c1", "e3"));
        assertTrue(checkNewPosition(setFigure(WHITE_BISHOP.name()), "c1", "f4"));
        assertTrue(checkNewPosition(setFigure(WHITE_BISHOP.name()), "c1", "g5"));
        assertTrue(checkNewPosition(setFigure(WHITE_BISHOP.name()), "c1", "h6"));
        assertTrue(checkNewPosition(setFigure(WHITE_BISHOP.name()), "f1", "g2"));
        assertTrue(checkNewPosition(setFigure(WHITE_BISHOP.name()), "f1", "h3"));
        assertTrue(checkNewPosition(setFigure(WHITE_BISHOP.name()), "f1", "e2"));
        assertTrue(checkNewPosition(setFigure(WHITE_BISHOP.name()), "f1", "d3"));
        assertTrue(checkNewPosition(setFigure(WHITE_BISHOP.name()), "f1", "c4"));
        assertTrue(checkNewPosition(setFigure(WHITE_BISHOP.name()), "f1", "b5"));
        assertTrue(checkNewPosition(setFigure(WHITE_BISHOP.name()), "f1", "a6"));
    }

    @Test
    void WhiteBishopNegativeTest() {
        assertFalse(checkNewPosition(setFigure(WHITE_BISHOP.name()), "c1", "c0"));
        assertFalse(checkNewPosition(setFigure(WHITE_BISHOP.name()), "c1", "c1"));
        assertFalse(checkNewPosition(setFigure(WHITE_BISHOP.name()), "c1", "b1"));
        assertFalse(checkNewPosition(setFigure(WHITE_BISHOP.name()), "f1", "f0"));
        assertFalse(checkNewPosition(setFigure(WHITE_BISHOP.name()), "f1", "h8"));
        assertFalse(checkNewPosition(setFigure(WHITE_BISHOP.name()), "f1", "b7"));
    }

    @Test
    void WhiteKnightPositiveTest() {
        assertTrue(checkNewPosition(setFigure(WHITE_KNIGHT.name()), "b1", "a3"));
        assertTrue(checkNewPosition(setFigure(WHITE_KNIGHT.name()), "b1", "c3"));
        assertTrue(checkNewPosition(setFigure(WHITE_KNIGHT.name()), "b1", "d2"));
        assertTrue(checkNewPosition(setFigure(WHITE_KNIGHT.name()), "g1", "f3"));
        assertTrue(checkNewPosition(setFigure(WHITE_KNIGHT.name()), "g1", "e2"));
        assertTrue(checkNewPosition(setFigure(WHITE_KNIGHT.name()), "g1", "h3"));
    }

    @Test
    void WhiteKnightNegativeTest() {
        assertFalse(checkNewPosition(setFigure(WHITE_KNIGHT.name()), "b1", "b1"));
        assertFalse(checkNewPosition(setFigure(WHITE_KNIGHT.name()), "b1", "a1"));
        assertFalse(checkNewPosition(setFigure(WHITE_KNIGHT.name()), "b1", "e0"));
        assertFalse(checkNewPosition(setFigure(WHITE_KNIGHT.name()), "g1", "d3"));
        assertFalse(checkNewPosition(setFigure(WHITE_KNIGHT.name()), "g1", "g1"));
    }
    @Test
    void BlackKingPositiveTest() {
        assertTrue(checkNewPosition(setFigure(BLACK_KING.name()), "e8", "d8"));
        assertTrue(checkNewPosition(setFigure(BLACK_KING.name()), "e8", "d7"));
        assertTrue(checkNewPosition(setFigure(BLACK_KING.name()), "e8", "e7"));
        assertTrue(checkNewPosition(setFigure(BLACK_KING.name()), "e8", "f8"));
        assertTrue(checkNewPosition(setFigure(BLACK_KING.name()), "e8", "f7"));
    }
    @Test
    void BlackKingNegativeTest() {
        assertFalse(checkNewPosition(setFigure(BLACK_KING.name()), "e8", "a8"));
        assertFalse(checkNewPosition(setFigure(BLACK_KING.name()), "e8", "e9"));
        assertFalse(checkNewPosition(setFigure(BLACK_KING.name()), "e8", "d6"));
        assertFalse(checkNewPosition(setFigure(BLACK_KING.name()), "e8", "e8"));
    }
    @Test
    void BlackQueenPositiveTest() {
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "a8"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "b8"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "c8"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "e8"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "f8"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "g8"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "h8"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "d7"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "d6"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "d5"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "d4"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "d3"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "d2"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "d1"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "e7"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "f6"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "g5"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "h4"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "c7"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "b6"));
        assertTrue(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "a5"));
    }
    @Test
    void BlackQueenNegativeTest() {
        assertFalse(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "c6"));
        assertFalse(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "d8"));
        assertFalse(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "f7"));
        assertFalse(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "d9"));
        assertFalse(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "d0"));
        assertFalse(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "h1"));
        assertFalse(checkNewPosition(setFigure(BLACK_QUEEN.name()), "d8", "b2"));
    }
    @Test
    void BlackPawnPositiveTest() {
        assertTrue(checkNewPosition(setFigure(BLACK_PAWN.name()), "a7", "a5"));
        assertTrue(checkNewPosition(setFigure(BLACK_PAWN.name()), "b7", "b6"));
        assertTrue(checkNewPosition(setFigure(BLACK_PAWN.name()), "h7", "h5"));
    }
    @Test
    void BlackPawnNegativeTest() {
        assertFalse(checkNewPosition(setFigure(BLACK_PAWN.name()), "a7", "a8"));
        assertFalse(checkNewPosition(setFigure(BLACK_PAWN.name()), "a7", "b8"));
        assertFalse(checkNewPosition(setFigure(BLACK_PAWN.name()), "a7", "b6"));
        assertFalse(checkNewPosition(setFigure(BLACK_PAWN.name()), "a7", "a7"));
        assertFalse(checkNewPosition(setFigure(BLACK_PAWN.name()), "a1", "a0"));
    }
    @Test
    void BlackRookPositiveTest() {
        assertTrue(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "d8"));
        assertTrue(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "b8"));
        assertTrue(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "c8"));
        assertTrue(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "e8"));
        assertTrue(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "f8"));
        assertTrue(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "g8"));
        assertTrue(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "h8"));
        assertTrue(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "a7"));
        assertTrue(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "a6"));
        assertTrue(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "a5"));
        assertTrue(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "a4"));
        assertTrue(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "a3"));
        assertTrue(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "a2"));
        assertTrue(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "a1"));
    }
    @Test
    void BlackRookNegativeTest() {
        assertFalse(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "b7"));
        assertFalse(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "a8"));
        assertFalse(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "f7"));
        assertFalse(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "a9"));
        assertFalse(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "h1"));
        assertFalse(checkNewPosition(setFigure(BLACK_ROOK.name()), "a8", "b2"));
    }
    @Test
    void BlackBishopPositiveTest() {
        assertTrue(checkNewPosition(setFigure(BLACK_BISHOP.name()), "c8", "b7"));
        assertTrue(checkNewPosition(setFigure(BLACK_BISHOP.name()), "c8", "a6"));
        assertTrue(checkNewPosition(setFigure(BLACK_BISHOP.name()), "c8", "d7"));
        assertTrue(checkNewPosition(setFigure(BLACK_BISHOP.name()), "c8", "e6"));
        assertTrue(checkNewPosition(setFigure(BLACK_BISHOP.name()), "c8", "f5"));
        assertTrue(checkNewPosition(setFigure(BLACK_BISHOP.name()), "c8", "g4"));
        assertTrue(checkNewPosition(setFigure(BLACK_BISHOP.name()), "c8", "h3"));
        assertTrue(checkNewPosition(setFigure(BLACK_BISHOP.name()), "f8", "g7"));
        assertTrue(checkNewPosition(setFigure(BLACK_BISHOP.name()), "f8", "h6"));
        assertTrue(checkNewPosition(setFigure(BLACK_BISHOP.name()), "f8", "e7"));
        assertTrue(checkNewPosition(setFigure(BLACK_BISHOP.name()), "f8", "d6"));
        assertTrue(checkNewPosition(setFigure(BLACK_BISHOP.name()), "f8", "c5"));
        assertTrue(checkNewPosition(setFigure(BLACK_BISHOP.name()), "f8", "b4"));
        assertTrue(checkNewPosition(setFigure(BLACK_BISHOP.name()), "f8", "a3"));
    }
    @Test
    void BlackBishopNegativeTest() {
        assertFalse(checkNewPosition(setFigure(BLACK_BISHOP.name()), "c8", "c9"));
        assertFalse(checkNewPosition(setFigure(BLACK_BISHOP.name()), "c8", "c8"));
        assertFalse(checkNewPosition(setFigure(BLACK_BISHOP.name()), "c8", "b8"));
        assertFalse(checkNewPosition(setFigure(BLACK_BISHOP.name()), "f8", "f9"));
        assertFalse(checkNewPosition(setFigure(BLACK_BISHOP.name()), "f8", "h1"));
        assertFalse(checkNewPosition(setFigure(BLACK_BISHOP.name()), "f8", "b2"));
    }
    @Test
    void BlackKnightPositiveTest() {
        assertTrue(checkNewPosition(setFigure(BLACK_KNIGHT.name()), "b8", "a6"));
        assertTrue(checkNewPosition(setFigure(BLACK_KNIGHT.name()), "b8", "c6"));
        assertTrue(checkNewPosition(setFigure(BLACK_KNIGHT.name()), "b8", "d7"));
        assertTrue(checkNewPosition(setFigure(BLACK_KNIGHT.name()), "g8", "f6"));
        assertTrue(checkNewPosition(setFigure(BLACK_KNIGHT.name()), "g8", "e7"));
        assertTrue(checkNewPosition(setFigure(BLACK_KNIGHT.name()), "g8", "h6"));
    }
    @Test
    void BlackKnightNegativeTest() {
        assertFalse(checkNewPosition(setFigure(BLACK_KNIGHT.name()), "b8", "b8"));
        assertFalse(checkNewPosition(setFigure(BLACK_KNIGHT.name()), "b8", "a8"));
        assertFalse(checkNewPosition(setFigure(BLACK_KNIGHT.name()), "b8", "e9"));
        assertFalse(checkNewPosition(setFigure(BLACK_KNIGHT.name()), "g8", "d6"));
        assertFalse(checkNewPosition(setFigure(BLACK_KNIGHT.name()), "g8", "g8"));
    }
}
