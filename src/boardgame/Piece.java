package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Por padr�o o Java j� inicia a vari�vel como nula, mas estou enfatizando.
	}

	protected Board getBoard() {
		return board;
	}
}
