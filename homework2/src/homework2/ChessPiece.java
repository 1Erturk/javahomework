package homework2;


public abstract class ChessPiece {

    private int value;

    BoardPosition position;

    PieceColor color;

    ChessPiece chessPiece;



    public ChessPiece(int value, BoardPosition position, PieceColor color) {
        this.value= value;
        this.position= position;
        this.color= color;
    }

    public ChessPiece(ChessPiece chessPiece) {
        this.chessPiece= chessPiece;
    }

    public int getValue() {
        return value;
    }

    public abstract boolean canMove(BoardPosition target, ChessBoard board);

    @Override
    public String toString() {
        return "Piece{" +
                "value=" + value +
                ", position=(" + position.getRow() +"," +position.getColumn() +
                "), color=" + color +
                '}';
    }
}
