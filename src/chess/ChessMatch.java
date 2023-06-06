package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece [][] mat = new ChessPiece[board.getRows()][board.getColums()];
		for(int i = 0; i<board.getRows(); i++) {
			for(int j = 0; j< board.getColums(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void placeNewPlace(char colum, int row, ChessPiece piece) {
		board.placePiece(piece,new ChessPosition(colum, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPlace('b', 6, new King(board, Color.WHITE));
		placeNewPlace('e', 8, new Rook(board, Color.BLACK));
		placeNewPlace('e', 1, new King(board, Color.WHITE));

		
	}
	
}
