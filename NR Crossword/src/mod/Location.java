package mod;

public class Location {

	private int _row, _col;
	//returns row
	public int getRow() { return _row; }
	//returns column
	public int getCol() { return _col; }
	//moves player down
	public void moveDown() { _row++; }
	//moves player up
	public void moveUp() { _row--; }
	//moves player left
	public void moveLeft() { _col--; }
	//moves player right
	public void moveRight() { _col++; }

	//initializes a row, col location on array
	public Location(int row, int col) {
		_row = row;
		_col = col;
	}
}