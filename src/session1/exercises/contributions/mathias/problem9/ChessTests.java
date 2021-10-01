package session1.exercises.contributions.mathias.problem9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChessTests {
    /* ========== Chessboard Tests ============ */
    /* ========== Piece Tests ================= */
    // Pawn tests
    @Test
    void pawnMoveTwoTilesFirstTurnReturnsTrue() {
        Piece pawn = new Piece(PieceType.PAWN, true);

        assertTrue(pawn.move(1,1,1,3));
    }

    /* ========== Dumb Unicode Tests ========== */
    @Test
    void whiteKingToStringIsUnicode() {
        assertEquals("♔", new Piece(PieceType.KING, true).toString());
    }
    @Test
    void whiteQueenToStringIsUnicode() {
        assertEquals("♕", new Piece(PieceType.QUEEN, true).toString());
    }
    @Test
    void whiteRookToStringIsUnicode() {
        assertEquals("♖", new Piece(PieceType.ROOK, true).toString());
    }
    @Test
    void whiteBishopToStringIsUnicode() {
        assertEquals("♗", new Piece(PieceType.BISHOP, true).toString());
    }
    @Test
    void whiteKnightToStringIsUnicode() {
        assertEquals("♘", new Piece(PieceType.KNIGHT, true).toString());
    }
    @Test
    void whitePawnToStringIsUnicode() {
        assertEquals("♙", new Piece(PieceType.PAWN, true).toString());
    }
    @Test
    void blackKingToStringIsUnicode() {
        assertEquals("♚", new Piece(PieceType.KING, false).toString());
    }
    @Test
    void blackQueenToStringIsUnicode() {
        assertEquals("♛", new Piece(PieceType.QUEEN, false).toString());
    }
    @Test
    void blackRookToStringIsUnicode() {
        assertEquals("♜", new Piece(PieceType.ROOK, false).toString());
    }
    @Test
    void blackBishopToStringIsUnicode() {
        assertEquals("♝", new Piece(PieceType.BISHOP, false).toString());
    }
    @Test
    void blackKnightToStringIsUnicode() {
        assertEquals("♞", new Piece(PieceType.KNIGHT, false).toString());
    }
    @Test
    void blackPawnToStringIsUnicode() {
        assertEquals("♟", new Piece(PieceType.PAWN, false).toString());
    }
}