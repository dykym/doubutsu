package doubutsu;

public class Move {
	int row;
	int col;
	int side;
	Boolean nari;
	public Move(int row, int col, int side, Boolean nari) {
		this.row = row; this.col = col; this.side = side; this.nari = nari;
	}
}
