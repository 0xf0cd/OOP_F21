package session1.exercises.contributions.mathias.problem9;

public class Chessboard {
    private final Piece[][] chessboard;

    public static void main(String[] args) {
        var c = new Chessboard();
        System.out.println(c);
    }

    // Set up default game board
    Chessboard() {
        chessboard = new Piece[8][8];

        // Initialize black team
        chessboard[0][0] = new Piece(PieceType.ROOK, false);
        chessboard[1][0] = new Piece(PieceType.KNIGHT, false);
        chessboard[2][0] = new Piece(PieceType.BISHOP, false);
        chessboard[3][0] = new Piece(PieceType.QUEEN, false);
        chessboard[4][0] = new Piece(PieceType.KING, false);
        chessboard[5][0] = new Piece(PieceType.BISHOP, false);
        chessboard[6][0] = new Piece(PieceType.KNIGHT, false);
        chessboard[7][0] = new Piece(PieceType.ROOK, false);
        for (int i = 0; i < 8; i++) {
            chessboard[i][1] = new Piece(PieceType.PAWN, false);
        }

        // Initialize white team
        chessboard[0][7] = new Piece(PieceType.ROOK, true);
        chessboard[1][7] = new Piece(PieceType.KNIGHT, true);
        chessboard[2][7] = new Piece(PieceType.BISHOP, true);
        chessboard[3][7] = new Piece(PieceType.QUEEN, true);
        chessboard[4][7] = new Piece(PieceType.KING, true);
        chessboard[5][7] = new Piece(PieceType.BISHOP, true);
        chessboard[6][7] = new Piece(PieceType.KNIGHT, true);
        chessboard[7][7] = new Piece(PieceType.ROOK, true);
        for (int i = 0; i < 8; i++) {
            chessboard[i][6] = new Piece(PieceType.PAWN, true);
        }
    }

    Piece getPieceAt(int x, int y) {
        return chessboard[x][y];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(192); // Number of chars needed
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if (chessboard[x][y] == null)
                    sb.append("[ ]");
                else
                    sb.append('[').append(getPieceAt(x,y)).append(']');
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    boolean isChecked() { return false; }
    boolean isWhiteTurn() { return false; }
    boolean isBGameOver() { return false; }
    boolean isWhiteWinner() { return false; }
    boolean isBlackWinner() { return false; }
}
