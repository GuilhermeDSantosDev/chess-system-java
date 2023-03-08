package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Por padrão o Java já inicia a variável como nula, mas estou enfatizando.
	}

	protected Board getBoard() {
		return board;
	}
}
