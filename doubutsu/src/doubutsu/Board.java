package doubutsu;

abstract class Piece {
	abstract public String name();
}

public class Board {
	static final int NROW = 4;
	static final int NCOL = 3;
	Piece ps[][];
	public Board() {
		ps = new Piece[NROW][NCOL];
	}
	public void move(Move m) {
		
	}
}
