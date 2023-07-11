package homework2;

public class Pawn extends ChessPiece {

    public Pawn(PieceColor color, int row, int column) {
        super(1, new BoardPosition(row, column), color);
    }

    public Pawn(ChessPiece chessPiece) {
        super(chessPiece);
    }

    @Override
    public boolean canMove(BoardPosition target, ChessBoard board) {


        if(board.get(position.getRow(), position.getColumn()).color==PieceColor.Black) {
            int targetRow= 8*(target.getRow());
            int targetColumn= target.getColumn();
            int targetPosition= targetRow+ targetColumn;

            if (board.chessPieces.get(targetPosition) == null) {
                int row = 8*(target.getRow() + 1);
                int column= target.getColumn();
                int position1= row+ column;
                if(board.chessPieces.get(position1)!=null && position.getColumn()==targetColumn) {
                    return true;
                } else {
                    return false;
                }
            }

            if (board.chessPieces.get(targetPosition) != null) {
                int row= 8*(target.getRow() + 1);
                int column1 = (target.getColumn())+1;
                int column2= (target.getColumn())-1;
                int position1= row+ column1;
                int position2= row+ column2;
                if(((board.chessPieces.get(position1)!=null && position.getColumn()+1==targetColumn ) ||
                        (board.chessPieces.get(position2)!= null && position.getColumn()-1==targetColumn))
                        && (board.get(target.getRow(), target.getColumn()).color==PieceColor.White)) {
                    return true;
                } else {
                    return false;
                }
            }

        } else if(board.get(position.getRow(), position.getColumn()).color==PieceColor.White){
            int targetRow= 8*(target.getRow());
            int targetColumn= target.getColumn();
            int targetPosition= targetRow+ targetColumn;

            if(board.chessPieces.get(targetPosition)==null) {
                int row= 8*(target.getRow() -1);
                int column= target.getColumn();
                int position1= row + column;
                if(board.chessPieces.get(position1)!=null && position.getColumn()==targetColumn) {
                    return true;
                } else {
                    return false;
                }
            }

            if(board.chessPieces.get(targetPosition)!= null) {
                int row= 8*(target.getRow()-1);
                int column1= target.getColumn() + 1;
                int column2= target.getColumn() - 1;
                int position1= row + column1;
                int position2= row + column2;
                if(((board.chessPieces.get(position1)!=null && position.getColumn()+1==targetColumn ) ||
                        (board.chessPieces.get(position2)!= null && position.getColumn()-1==targetColumn))
                        && (board.get(target.getRow(), target.getColumn()).color==PieceColor.Black)) {
                    return true;
                } else {
                    return false;
                }
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "Pawn{" + "position=(" + position.getRow() +"," +position.getColumn() + "), color=" + color + '}';
    }
}


