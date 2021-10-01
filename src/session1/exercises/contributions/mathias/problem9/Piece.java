package session1.exercises.contributions.mathias.problem9;

public class Piece {
    private PieceType type;
    private boolean isWhite;

    Piece(PieceType type, Boolean isWhite) {
        this.type = type;
        this.isWhite = isWhite;
    }

    public boolean move(int x1, int y1, int x2, int y2) {
        return switch (this.type) {
            case KING   -> moveKing(x1, y1, x2, y2);
            case QUEEN  -> moveQueen(x1, y1, x2, y2);
            case ROOK   -> moveRook(x1, y1, x2, y2);
            case BISHOP -> moveBishop(x1, y1, x2, y2);
            case KNIGHT -> moveKnight(x1, y1, x2, y2);
            case PAWN   -> movePawn(x1, y1, x2, y2);
        };
    }

    private boolean moveKing(int x1, int y1, int x2, int y2) { return false; }
    private boolean moveQueen(int x1, int y1, int x2, int y2) { return false; }
    private boolean moveRook(int x1, int y1, int x2, int y2) { return false; }
    private boolean moveBishop(int x1, int y1, int x2, int y2) { return false; }
    private boolean moveKnight(int x1, int y1, int x2, int y2) { return false; }
    private boolean movePawn(int x1, int y1, int x2, int y2) {
        return y2 <= y1 + 2;
    }

    @Override
    public String toString() {
        // Return String representing Piece in UNICODE
        return switch (this.type) {
            /*  Type   | ColorCheck |    UnicodeChar   */
            case KING   -> isWhite ? "\u2654" : "\u265A";
            case QUEEN  -> isWhite ? "\u2655" : "\u265B";
            case ROOK   -> isWhite ? "\u2656" : "\u265C";
            case BISHOP -> isWhite ? "\u2657" : "\u265D";
            case KNIGHT -> isWhite ? "\u2658" : "\u265E";
            case PAWN   -> isWhite ? "\u2659" : "\u265F";
        };
    }
}
