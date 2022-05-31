package mod;

import javax.swing.*;

public class Player {

	private Location _position;
	private boolean _isDead;
	public Location getLoc() { return _position; }
	public boolean isDead() { return _isDead; }
	public void moveUp() { _position.moveUp(); }
	public void moveDown() { _position.moveDown(); }
	public void moveLeft() { _position.moveLeft(); }
	public void moveRight() { _position.moveRight(); }

	//moves user position based on directions
	public void move(Direction d) {
		if (d == Direction.UP)
			moveUp();
		else if (d == Direction.DOWN)
			moveDown();
		else if (d == Direction.LEFT)
			moveLeft();
		else
			moveRight();
	}

	//initializes player at a specific position
	public Player(Location pos) {
		_position = pos;
		_isDead = false;

	}

	//checks whether their movement in the board is valid
	public boolean isValid( Maze _map, Direction d) {

		char [][] map = _map.getMap();
		int row = _position.getRow();
		int col = _position.getCol();

		if(d == Direction.UP) {
			if(row == 0)
				return false;
			return true;

		}
		else if(d == Direction.DOWN) {
			if(row == map.length - 1)
				return false;
			return true;
		}
		else if(d == Direction.LEFT) {
			if(col == 0)
				return false;
			return true;
		}
		else {
			if(col == map[row].length - 1)
				return false;
			return true;
		}

	}



}
