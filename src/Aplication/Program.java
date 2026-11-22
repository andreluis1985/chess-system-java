package Aplication;

import java.util.Scanner;

import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		ChessMatch chessMatch = new ChessMatch ();
		
		while(true) {
		UI.printBoard(chessMatch.getPieces());
		System.out.println();
		System.out.println("Source: ");
		ChessPosition source = UI.readChessposition (sc);
		
		System.out.println();
		System.out.println("Target: ");
		ChessPosition target = UI.readChessposition (sc);
		
		ChessPiece capturedPiece = chessMatch.performChessMove(source ,target);
	
		}
	}

}
