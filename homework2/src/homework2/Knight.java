package homework2;

public class Knight extends ChessPiece {


    public Knight(PieceColor color, int row, int column) {
        super(3, new BoardPosition(row, column), color);
    }

    public Knight(ChessPiece chessPiece) {
        super(chessPiece);
    }

    @Override
    public boolean canMove(BoardPosition target, ChessBoard board) {
        if(board.get(position.getRow(), position.getColumn()).color==PieceColor.Black) {
            int targetRow= 8*(target.getRow());
            int targetColumn= target.getColumn();
            int targetPosition= targetRow+ targetColumn;

            if(board.chessPieces.get(targetPosition)==null) {
                int row1= 8*(target.getRow()+2);
                int row2= 8*(target.getRow()+1);
                int row3= 8*(target.getRow()-1);
                int row4= 8*(target.getRow()-2);
                int column1= (target.getColumn()+2);
                int column2= (target.getColumn()+1);
                int column3= (target.getColumn()-1);
                int column4= (target.getColumn()-2);
                int position1= row1+column2;
                int position2= row2+column1;
                int position3= row3+column1;
                int position4= row4+column2;
                int position5= row4+column3;
                int position6= row3+column4;
                int position7= row2+column4;
                int position8= row1+column3;

                if(target.getRow()-position.getRow()==2 && target.getColumn()-position.getColumn()==1) {
                    if (board.chessPieces.get(position5)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==1 && target.getColumn()-position.getColumn()==2) {
                    if (board.chessPieces.get(position6)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==-1 && target.getColumn()-position.getColumn()==2) {
                    if (board.chessPieces.get(position7)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==-2 && target.getColumn()-position.getColumn()==1) {
                    if (board.chessPieces.get(position8)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==-2 && target.getColumn()-position.getColumn()==-1) {
                    if (board.chessPieces.get(position1)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==-1 && target.getColumn()-position.getColumn()==-2) {
                    if (board.chessPieces.get(position2)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==1 && target.getColumn()-position.getColumn()==-2) {
                    if (board.chessPieces.get(position3)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==2 && target.getColumn()-position.getColumn()==-1) {
                    if (board.chessPieces.get(position4)!=null)
                        return true;
                }
                return false;
            }

            if(board.chessPieces.get(targetPosition)!=null && board.chessPieces.get(targetPosition).color==PieceColor.White) {
                int row1= 8*(target.getRow()+2);
                int row2= 8*(target.getRow()+1);
                int row3= 8*(target.getRow()-1);
                int row4= 8*(target.getRow()-2);
                int column1= 8*(target.getColumn()+2);
                int column2= 8*(target.getColumn()+1);
                int column3= 8*(target.getColumn()-1);
                int column4= 8*(target.getColumn()-2);
                int position1= row1+column2;
                int position2= row2+column1;
                int position3= row3+column1;
                int position4= row4+column2;
                int position5= row4+column3;
                int position6= row3+column4;
                int position7= row2+column4;
                int position8= row1+column3;

                if(target.getRow()-position.getRow()==2 && target.getColumn()-position.getColumn()==1) {
                    if (board.chessPieces.get(position5)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==1 && target.getColumn()-position.getColumn()==2) {
                    if (board.chessPieces.get(position6)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==-1 && target.getColumn()-position.getColumn()==2) {
                    if (board.chessPieces.get(position7)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==-2 && target.getColumn()-position.getColumn()==1) {
                    if (board.chessPieces.get(position8)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==-2 && target.getColumn()-position.getColumn()==-1) {
                    if (board.chessPieces.get(position1)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==-1 && target.getColumn()-position.getColumn()==-2) {
                    if (board.chessPieces.get(position2)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==1 && target.getColumn()-position.getColumn()==-2) {
                    if (board.chessPieces.get(position3)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==2 && target.getColumn()-position.getColumn()==-1) {
                    if (board.chessPieces.get(position4)!=null)
                        return true;
                }
                return false;


            } else {
                return false;
            }





        }
        else if(board.get(position.getRow(), position.getColumn()).color==PieceColor.White) {
            int targetRow= 8*(target.getRow());
            int targetColumn= target.getColumn();
            int targetPosition= targetRow+ targetColumn;

            if(board.chessPieces.get(targetPosition)==null) {
                int row1= 8*(target.getRow()+2);
                int row2= 8*(target.getRow()+1);
                int row3= 8*(target.getRow()-1);
                int row4= 8*(target.getRow()-2);
                int column1= 8*(target.getColumn()+2);
                int column2= 8*(target.getColumn()+1);
                int column3= 8*(target.getColumn()-1);
                int column4= 8*(target.getColumn()-2);
                int position1= row1+column2;
                int position2= row2+column1;
                int position3= row3+column1;
                int position4= row4+column2;
                int position5= row4+column3;
                int position6= row3+column4;
                int position7= row2+column4;
                int position8= row1+column3;

                if(target.getRow()-position.getRow()==2 && target.getColumn()-position.getColumn()==1) {
                    if (board.chessPieces.get(position5)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==1 && target.getColumn()-position.getColumn()==2) {
                    if (board.chessPieces.get(position6)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==-1 && target.getColumn()-position.getColumn()==2) {
                    if (board.chessPieces.get(position7)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==-2 && target.getColumn()-position.getColumn()==1) {
                    if (board.chessPieces.get(position8)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==-2 && target.getColumn()-position.getColumn()==-1) {
                    if (board.chessPieces.get(position1)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==-1 && target.getColumn()-position.getColumn()==-2) {
                    if (board.chessPieces.get(position2)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==1 && target.getColumn()-position.getColumn()==-2) {
                    if (board.chessPieces.get(position3)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==2 && target.getColumn()-position.getColumn()==-1) {
                    if (board.chessPieces.get(position4)!=null)
                        return true;
                }
                return false;
            }

            if(board.chessPieces.get(targetPosition)!=null && board.chessPieces.get(targetPosition).color==PieceColor.Black) {
                int row1= 8*(target.getRow()+2);
                int row2= 8*(target.getRow()+1);
                int row3= 8*(target.getRow()-1);
                int row4= 8*(target.getRow()-2);
                int column1= 8*(target.getColumn()+2);
                int column2= 8*(target.getColumn()+1);
                int column3= 8*(target.getColumn()-1);
                int column4= 8*(target.getColumn()-2);
                int position1= row1+column2;
                int position2= row2+column1;
                int position3= row3+column1;
                int position4= row4+column2;
                int position5= row4+column3;
                int position6= row3+column4;
                int position7= row2+column4;
                int position8= row1+column3;

                if(target.getRow()-position.getRow()==2 && target.getColumn()-position.getColumn()==1) {
                    if (board.chessPieces.get(position5)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==1 && target.getColumn()-position.getColumn()==2) {
                    if (board.chessPieces.get(position6)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==-1 && target.getColumn()-position.getColumn()==2) {
                    if (board.chessPieces.get(position7)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==-2 && target.getColumn()-position.getColumn()==1) {
                    if (board.chessPieces.get(position8)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==-2 && target.getColumn()-position.getColumn()==-1) {
                    if (board.chessPieces.get(position1)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==-1 && target.getColumn()-position.getColumn()==-2) {
                    if (board.chessPieces.get(position2)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==1 && target.getColumn()-position.getColumn()==-2) {
                    if (board.chessPieces.get(position3)!=null)
                        return true;
                }
                if(target.getRow()-position.getRow()==2 && target.getColumn()-position.getColumn()==-1) {
                    if (board.chessPieces.get(position4)!=null)
                        return true;
                }
                return false;

            } else {
                return false;
            }


        }

        return false;
    }

    @Override
    public String toString() {
        return "Knight{" + "position=(" + position.getRow() +"," +position.getColumn() + "), color=" + color + '}';
    }
}
