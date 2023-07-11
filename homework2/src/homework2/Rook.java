package homework2;

public class Rook extends ChessPiece {


    public Rook(PieceColor color, int row, int column) {
        super(5, new BoardPosition(row, column), color);
    }

    public Rook(ChessPiece chessPiece) {
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
            if((target.getRow()!=position.getRow()) && (target.getColumn()!=position.getColumn())) {
                return false;
            }



            if(position.getRow()==target.getRow()) {
                if(target.getColumn()>position.getColumn()) {
                    for (int column = position.getColumn()+1; column < target.getColumn(); column++) {
                        if(board.get(position.getRow(), column)!=null) {
                            return false;
                        }
                    }
                }
                if(target.getColumn()<position.getColumn()) {
                    for (int column = position.getColumn()-1; column > target.getColumn() ; column--) {
                        if(board.get(position.getRow(), column)!=null) {
                            return false;
                        }
                    }
                }
            }

            if(position.getColumn()==target.getColumn()) {
                if(target.getRow()>position.getRow()) {
                    for (int row = position.getRow()+1; row < target.getRow(); row++) {
                        if(board.get(row, position.getColumn())!=null) {
                            return false;
                        }
                    }
                }
                if(target.getRow()<position.getRow()) {
                    for (int row = position.getRow()-1; row > target.getRow() ; row--) {
                        if(board.get(row, position.getColumn())!=null) {
                            return false;
                        }
                    }
                }
            }


        }


        else if(board.get(position.getRow(), position.getColumn()).color==PieceColor.White) {
            int targetRow= 8*(target.getRow());
            int targetColumn= target.getColumn();
            int targetPosition= targetRow+ targetColumn;

            if(board.chessPieces.get(targetPosition)!=null && board.chessPieces.get(targetPosition).color==PieceColor.White) {
                return false;
            }
            if((target.getRow()!=position.getRow()) && (target.getColumn()!=position.getColumn())) {
                return false;
            }



            if(position.getRow()==target.getRow()) {
                if(target.getColumn()>position.getColumn()) {
                    for (int column = position.getColumn()+1; column < target.getColumn(); column++) {
                        if(board.get(position.getRow(), column)!=null) {
                            return false;
                        }
                    }
                }
                if(target.getColumn()<position.getColumn()) {
                    for (int column = position.getColumn()-1; column > target.getColumn() ; column--) {
                        if(board.get(position.getRow(), column)!=null) {
                            return false;
                        }
                    }
                }
            }

            if(position.getColumn()==target.getColumn()) {
                if(target.getRow()>position.getRow()) {
                    for (int row = position.getRow()+1; row < target.getRow(); row++) {
                        if(board.get(row, position.getColumn())!=null) {
                            return false;
                        }
                    }
                }
                if(target.getRow()<position.getRow()) {
                    for (int row = position.getRow()-1; row > target.getRow() ; row--) {
                        if(board.get(row, position.getColumn())!=null) {
                            return false;
                        }
                    }
                }
            }

        }

        return true;
    }

    @Override
    public String toString() {
        return "Rook{" + "position=(" + position.getRow() +"," +position.getColumn() + "), color=" + color + '}';
    }
}
