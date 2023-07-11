package homework2;

public class Bishop extends ChessPiece {

    public Bishop(PieceColor color, int row, int column) {
        super(3, new BoardPosition(row, column), color);
    }

    public Bishop(ChessPiece chessPiece) {
        super(chessPiece);
    }

    @Override
    public boolean canMove(BoardPosition target, ChessBoard board) {
        if(board.get(position.getRow(), position.getColumn()).color==PieceColor.Black) {
            int targetRow= 8*(target.getRow());
            int targetColumn= target.getColumn();
            int targetPosition= targetRow+ targetColumn;

            if(board.chessPieces.get(targetPosition)!=null && board.chessPieces.get(targetPosition).color==PieceColor.Black) {
                return false;
            }
            if((Math.abs(target.getRow()-position.getRow()))!=(Math.abs(target.getColumn()-position.getColumn()))) {
                return false;
            }

            if(target.getRow()>position.getRow() && target.getColumn()>position.getColumn()) {
                int col1= position.getColumn()+1;
                for (int row1 = position.getRow()+1; row1 < target.getRow() ; row1++) {
                    if(board.get(row1,col1)!=null) {
                        return false;
                    }
                    col1++;
                }
            }

            if(target.getRow()>position.getRow() && target.getColumn()<position.getColumn()) {
                int col2= position.getColumn()-1;
                for (int row2 = position.getRow()+1; row2 < target.getRow(); row2++) {
                    if(board.get(row2,col2)!=null) {
                        return false;
                    }
                    col2--;
                }
            }

            if(target.getRow()<position.getRow() && target.getColumn()<position.getColumn()) {
                int col3= position.getColumn()-1;
                for (int row3 = position.getRow()-1; row3 > target.getRow(); row3--) {
                    if(board.get(row3,col3)!=null) {
                        return false;
                    }
                    col3--;
                }
            }

            if(target.getRow()<position.getRow() && target.getColumn()>position.getColumn()) {
                int col4= position.getColumn()+1;
                for (int row4 = position.getRow()-1; row4 > target.getRow(); row4--) {
                    if(board.get(row4,col4)!=null) {
                        return false;
                    }
                    col4++;
                }
            }
            return true;

        }

        else if(board.get(position.getRow(), position.getColumn()).color==PieceColor.White) {
            int targetRow= 8*(target.getRow());
            int targetColumn= target.getColumn();
            int targetPosition= targetRow+ targetColumn;

            if(board.chessPieces.get(targetPosition)!=null && board.chessPieces.get(targetPosition).color==PieceColor.White) {
                return false;
            }
            if((Math.abs(target.getRow()-position.getRow()))!=(Math.abs(target.getColumn()-position.getColumn()))) {
                return false;
            }

            if(target.getRow()>position.getRow() && target.getColumn()>position.getColumn()) {
                int col1= position.getColumn()+1;
                for (int row1 = position.getRow()+1; row1 < target.getRow() ; row1++) {
                    if(board.get(row1,col1)!=null) {
                        return false;
                    }
                    col1++;
                }
            }

            if(target.getRow()>position.getRow() && target.getColumn()<position.getColumn()) {
                int col2= position.getColumn()-1;
                for (int row2 = position.getRow()+1; row2 < target.getRow(); row2++) {
                    if(board.get(row2,col2)!=null) {
                        return false;
                    }
                    col2--;
                }
            }

            if(target.getRow()<position.getRow() && target.getColumn()<position.getColumn()) {
                int col3= position.getColumn()-1;
                for (int row3 = position.getRow()-1; row3 > target.getRow(); row3--) {
                    if(board.get(row3,col3)!=null) {
                        return false;
                    }
                    col3--;
                }
            }

            if(target.getRow()<position.getRow() && target.getColumn()>position.getColumn()) {
                int col4= position.getColumn()+1;
                for (int row4 = position.getRow()-1; row4 > target.getRow(); row4--) {
                    if(board.get(row4,col4)!=null) {
                        return false;
                    }
                    col4++;
                }
            }
            return true;

        }
        return true;
    }

    @Override
    public String toString() {
        return "Bishop{" + "position=(" + position.getRow() +"," +position.getColumn() + "), color=" + color + '}';
    }
}
