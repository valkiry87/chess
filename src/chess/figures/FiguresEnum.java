package chess.figures;

public enum FiguresEnum {
    WHITE_KING ("White King"),
    WHITE_QUEEN ("White Queen"),
    WHITE_ROOK("White Rook"),
    WHITE_BISHOP("White Bishop"),
    WHITE_KNIGHT("White Knight"),
    WHITE_PAWN("White Pawn"),
    BLACK_KING("Black King"),
    BLACK_QUEEN("Black Queen"),
    BLACK_ROOK("Black Rook"),
    BLACK_BISHOP("Black Bishop"),
    BLACK_KNIGHT("Black Knight"),
    BLACK_PAWN("Black Pawn");
    public final String figureName;
    FiguresEnum (final String figureName) {
        this.figureName = figureName;
    }
}
