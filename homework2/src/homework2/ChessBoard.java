package homework2;

import java.util.ArrayList;

public class ChessBoard {

    ArrayList<ChessPiece> chessPieces = new ArrayList<>();

    private final int boardSize = 8;


    public ChessBoard(ArrayList<ChessPiece> chessPieces) {
        this.chessPieces = chessPieces;
    }




    public ChessPiece get(int row, int column) {
        int r= 8*row;
        int p= r+ column;
        return chessPieces.get(p);
    }


    public int materialAdvantage(PieceColor color) {
        int totalValueOfTheGivenColor= 0;
        int totalValueOfTheOpponentColor= 0;
        for (int i = 0; i < chessPieces.size() ; i++) {
            if(chessPieces.get(i)!=null) {
                if (chessPieces.get(i).color==color) {
                    totalValueOfTheGivenColor += chessPieces.get(i).getValue();
                }
                if(chessPieces.get(i).color!=color) {
                    totalValueOfTheOpponentColor += chessPieces.get(i).getValue();
                }
            } else {
                totalValueOfTheGivenColor+=0;
                totalValueOfTheOpponentColor+=0;
            }
        }
        return (totalValueOfTheGivenColor-totalValueOfTheOpponentColor);
    }

    public int attackedBy(BoardPosition p, PieceColor c, ChessBoard board) {
        int number= 0;
        for (int i = 0; i < chessPieces.size(); i++) {
            if(chessPieces.get(i)!=null) {
                if(chessPieces.get(i).color==c) {
                    if(chessPieces.get(i).canMove(p, board)) {
                        number+= 1;
                    }
                }
            }
        }
        return number;
    }

    public int safety(ChessPiece piece, ChessBoard board) {
        int defence= 0;
        int attack= 0;
        BoardPosition position1= piece.position;
        PieceColor color= piece.color;
        for (int i = 0; i < chessPieces.size(); i++) {
            if(chessPieces.get(i)!=null) {
                if (chessPieces.get(i).color != color) {
                    if (chessPieces.get(i).canMove(position1, board)) {
                        attack += 1;
                    }
                }
                if (chessPieces.get(i).color == color) {
                    if (chessPieces.get(i).canMove(position1, board)) {
                        defence += 1;
                    }
                }
            }
        }
        return (attack-defence);
    }

    //27, 28, 35, 36
    public int centralControl(PieceColor color, ChessBoard board) {
        int number= 0;
        for (int i = 0; i < chessPieces.size() ; i++) {
            if(chessPieces.get(i)!=null && chessPieces.get(i).color== color) {

                if (chessPieces.get(i).canMove(new BoardPosition(3,3), board)) {
                    number+= 1;
                } else if (chessPieces.get(i).canMove(new BoardPosition(4,4), board)) {
                    number+= 1;
                } else if (chessPieces.get(i).canMove(new BoardPosition(3,4), board)) {
                    number+= 1;
                } else if (chessPieces.get(i).canMove(new BoardPosition(4,3), board)) {
                    number+= 1;
                }

            }
        }
        return number;
    }

    int i= 0;

     @Override public String toString() {
        String st= "";
        st += "\n";

        for (int row = 0; row < boardSize; row++) {
            for (int column = 0; column < boardSize; column++) {
                st+= " ";
                if(chessPieces.get(i)==null) {
                    st+= "0";
                    i++;
                }
                else {
                    st += chessPieces.get(i).getValue();
                    i++;
                }
            }
            st += "\n";
        }
        return st;
     }



}
