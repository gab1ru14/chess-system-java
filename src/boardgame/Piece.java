package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() { // somente classes do mesmo pacote e subclasses podem acessar o taboleiro
		return board;
	}

	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position){
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	public boolean isThereAniPossibleMove() {
		 boolean[][] mat = possibleMoves();
		 for(int i = 0; i< mat.length; i++) {
			 for(int j = 0; j < mat.length; j++) {
				 if(mat[i][j]) {
					 return true;
				 }			 }
		 }
		 return false;
	}
	
	
}
