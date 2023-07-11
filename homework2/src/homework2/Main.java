package homework2;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ChessPiece> chessPieces= new ArrayList<>();
        int boardSize= 8;


        chessPieces.add(0, new Rook(PieceColor.White, 0, 0));
        chessPieces.add(1, new Knight(PieceColor.White, 0, 1));
        chessPieces.add(2, new Bishop(PieceColor.White, 0, 2 ));
        chessPieces.add(3, new King(PieceColor.White, 0, 3));
        chessPieces.add(4, new Queen(PieceColor.White, 0, 4 ));
        chessPieces.add(5, new Bishop(PieceColor.White, 0, 5 ));
        chessPieces.add(6, null);
        chessPieces.add(7, new Rook(PieceColor.White, 0, 7));
        chessPieces.add(8, new Pawn(PieceColor.White, 1, 0 ));
        chessPieces.add(9, new Pawn(PieceColor.White, 1, 1));
        chessPieces.add(10, new Pawn(PieceColor.White, 1, 2));
        chessPieces.add(11, new Pawn(PieceColor.White, 1, 3 ));
        chessPieces.add(12, null);
        chessPieces.add(13, null);
        chessPieces.add(14, new Pawn(PieceColor.White, 1, 6 ));
        chessPieces.add(15, new Pawn(PieceColor.White, 1, 7 ));

        chessPieces.add(16, null);chessPieces.add(17, null);chessPieces.add(18, null);chessPieces.add(19, null);
        chessPieces.add(20, null);chessPieces.add(21, new Knight(PieceColor.White, 2, 5));chessPieces.add(22, null);chessPieces.add(23, null);
        chessPieces.add(24, null);chessPieces.add(25, null);chessPieces.add(26, null);chessPieces.add(27, null);
        chessPieces.add(28, null);chessPieces.add(29, null);chessPieces.add(30, null);chessPieces.add(31, null);
        chessPieces.add(32, null);chessPieces.add(33, new Queen(PieceColor.Black, 4, 1));chessPieces.add(34, null);chessPieces.add(35, null);
        chessPieces.add(36, null);chessPieces.add(37, null);chessPieces.add(38, null);chessPieces.add(39, null);
        chessPieces.add(40, null);chessPieces.add(41, null);chessPieces.add(42, null);chessPieces.add(43, null);
        chessPieces.add(44, null);chessPieces.add(45, null);chessPieces.add(46, null);chessPieces.add(47, null);

        chessPieces.add(48, new Pawn(PieceColor.Black, 6, 0 ));
        chessPieces.add(49, null);
        chessPieces.add(50, new Pawn(PieceColor.Black, 6, 2));
        chessPieces.add(51, new Pawn(PieceColor.Black, 6, 3 ));
        chessPieces.add(52, null);
        chessPieces.add(53, new Pawn(PieceColor.Black, 6, 5 ));
        chessPieces.add(54, new Pawn(PieceColor.Black, 6, 6 ));
        chessPieces.add(55, null);
        chessPieces.add(56, new Rook(PieceColor.Black, 7, 0 ));
        chessPieces.add(57, new Knight(PieceColor.Black, 7, 1 ));
        chessPieces.add(58, new Bishop(PieceColor.Black, 7, 2));
        chessPieces.add(59, new King(PieceColor.Black, 7, 3 ));
        chessPieces.add(60, null);
        chessPieces.add(61, new Bishop(PieceColor.Black, 7, 5 ));
        chessPieces.add(62, new Knight(PieceColor.Black, 7, 6 ));
        chessPieces.add(63, new Rook(PieceColor.Black, 7, 7 ));

        ChessBoard chessboard= new ChessBoard(chessPieces);





        System.out.println(chessboard);

        System.out.println("Canmove Test for Pawn:");
        if (chessPieces.get(50).canMove(new BoardPosition(3,2), chessboard)) {
            System.out.println("Yes, it can move." +" From (" +chessPieces.get(50).position.getRow() +"," +chessPieces.get(50).position.getColumn() + ")"
                    +" to (3,2)");
        } else {
            System.out.println("No, it cannot move." +" From (" +chessPieces.get(50).position.getRow() +"," +chessPieces.get(50).position.getColumn() + ")"
                    +" to (3,2)");
        }


        System.out.println("\nCanmove Test for Bishop:");
        if(chessPieces.get(58).canMove(new BoardPosition(5,0), chessboard)) {
            System.out.println("Yes, it can move." +" From (" +chessPieces.get(58).position.getRow() +"," +chessPieces.get(58).position.getColumn() + ")"
                    +" to (5,0)");
        } else {
            System.out.println("No, it cannot move." +" From (" +chessPieces.get(58).position.getRow() +"," +chessPieces.get(58).position.getColumn() + ")"
                    +" to (5,0)");
        }

        System.out.println("\nCanmove Test for Rook:");
        if(chessPieces.get(63).canMove(new BoardPosition(5,3), chessboard)) {
            System.out.println("Yes, it can move." +" From (" +chessPieces.get(63).position.getRow() +"," +chessPieces.get(63).position.getColumn() + ")"
                    +" to (5,3)");
        } else {
            System.out.println("No, it cannot move." +" From (" +chessPieces.get(63).position.getRow() +"," +chessPieces.get(63).position.getColumn() + ")"
                    +" to (5,3)");
        }

        System.out.println("\nCanmove Test for Queen:");
        if(chessPieces.get(4).canMove(new BoardPosition(6, 4), chessboard)) {
            System.out.println("Yes, it can move." +" From (" +chessPieces.get(4).position.getRow() +"," +chessPieces.get(4).position.getColumn() + ")"
                    +" to (6,4)");
        } else {
            System.out.println("No, it cannot move." +" From (" +chessPieces.get(4).position.getRow() +"," +chessPieces.get(4).position.getColumn() + ")"
                    +" to (6,4)");
        }

        System.out.println("\nCanmove Test for Knight:");
        if(chessPieces.get(57).canMove(new BoardPosition(5,0), chessboard)) {
            System.out.println("Yes, it can move." +" From (" +chessPieces.get(57).position.getRow() +"," +chessPieces.get(57).position.getColumn() + ")"
                    +" to (5,0)");
        } else {
            System.out.println("No, it cannot move." +" From (" +chessPieces.get(57).position.getRow() +"," +chessPieces.get(57).position.getColumn() + ")"
                    +" to (5,0)");
        }

        System.out.println("\nCanmove Test for King:");
        if(chessPieces.get(59).canMove(new BoardPosition(7,4), chessboard)) {
            System.out.println("Yes, it can move." +" From (" +chessPieces.get(59).position.getRow() +"," +chessPieces.get(59).position.getColumn() + ")"
                    +" to (7,4)");
        } else {
            System.out.println("No, it cannot move." +" From (" +chessPieces.get(59).position.getRow() +"," +chessPieces.get(59).position.getColumn() + ")"
                    +" to (7,4)");
        }



        System.out.println("\n\nMaterial Advantage Of Black: " +chessboard.materialAdvantage(PieceColor.Black));
        System.out.println("Material Advantage Of White: " +chessboard.materialAdvantage(PieceColor.White));


        System.out.println("\nThe number of pieces of the given color(Black) that can move to the given position(5,3) in one move: "
                +chessboard.attackedBy(new BoardPosition(5,3), PieceColor.Black, chessboard));
        System.out.println("The number of pieces of the given color(White) that can move to the given position(1,4) in one move: "
                +chessboard.attackedBy(new BoardPosition(1,4), PieceColor.White, chessboard));


        System.out.println("\nSafety of " +chessPieces.get(33).toString() +": " +chessboard.safety(chessPieces.get(33), chessboard));


        System.out.println("\nCentral control for Black pieces: " +chessboard.centralControl(PieceColor.Black, chessboard));
        System.out.println("Central control for White pieces: " +chessboard.centralControl(PieceColor.White, chessboard));

        System.out.println("\n" +chessPieces.get(48).toString());







    }
}

