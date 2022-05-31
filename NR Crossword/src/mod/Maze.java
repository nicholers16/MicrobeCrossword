package mod;

import javax.swing.*;

public class Maze {

	private Location  _trap1, _trap2, _trap3, _trap4, _trap5, _trap6, _trap7, _trap8, _trap9, _trap10, _trap11, _trap12, _trap13;


	private char[][] _map;
	private char[][] _newWords;
	private int _guesscnt;
	private String _name;

	//getter methods for "traps" (characters), words, maps an guess count values
	public int getGuessCnt () {return _guesscnt;}
	public char[][] getMap() {
		return _map;
	}
	public char[][] getNewWords() {
		return _newWords;
	}
	public Location getTrap1() {
		return _trap1;
	}
	public Location getTrap2() {
		return _trap2;
	}
	public Location getTrap3() {
		return _trap3;
	}
	public Location getTrap4() {
		return _trap4;
	}
	public Location getTrap5() {
		return _trap5;
	}
	public Location getTrap6() {
		return _trap6;
	}
	public Location getTrap7() {
		return _trap7;
	}
	public Location getTrap8() {
		return _trap8;
	}
	public Location getTrap9() {
		return _trap9;
	}
	public Location getTrap10() {
		return _trap10;
	}
	public Location getTrap11() {
		return _trap11;
	}
	public Location getTrap12() {
		return _trap12;
	}
	public Location getTrap13() {
		return _trap13;
	}
	public String getName() { return _name; }

	//increments guess count
	public void updateGuessCount(){
		_guesscnt++;
	}

	//initializes the answers array
	public Maze() {
		_map = new char[][]{
				{  0,   0,   0, 'E',   0,   0,   0,   0, 'G',   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
				{  0,   0,   0, 'U',   0,   0,   0,   0, 'E', 'X', 'T', 'I', 'N', 'C', 'T',   0,   0,   0,   0,   0},
				{  0,   0,   0, 'K',   0,   0,   0,   0, 'N',   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
				{  0,   0, 'V', 'A', 'C', 'C', 'I', 'N', 'E',   0,   0,   0,   0, 'M',   0,   0,   0,   0,   0,   0},
				{  0, 'V', 'I', 'R', 'U', 'S',   0,   0,   0,   0,   0,   0,   0, 'A',   0,   0,   0,   0,   0,   0},
				{  0,   0,   0, 'Y',   0,   0,   0,   0,   0,   0,   0,   0,   0, 'T',   0,   0,   0,   0,   0,   0},
				{'C', 'H', 'L', 'O', 'R', 'O', 'P', 'H', 'Y', 'L', 'L',   0,   0, 'T',   0,   0,   0,   0,   0,   0},
				{  0,   0,   0, 'T',   0,   0,   0,   0, 'E', 'V', 'O', 'L', 'V', 'E',   0,   0,   0,   0,   0,   0},
				{  0,   0,   0, 'E',   0,   0,   0,   0, 'A',   0,   0,   0,   0, 'R',   0,   0,   0,   0,   0,   0},
				{  0, 'D',   0,   0,   0,   0,   0,   0, 'S',   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
				{  0, 'N',   0,   0,   0,   0,   0,   0, 'T',   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
				{  0, 'A', 'B', 'I', 'O', 'T', 'I', 'C',   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
				{  0,   0, 'I',   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
				{  0,   0, 'O',   0,   0,   0, 'D', 'E', 'C', 'O', 'M', 'P', 'O', 'S', 'E', 'R',   0,   0,   0,   0},
				{  0,   0, 'T',   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
				{  0,   0, 'I',   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
				{  0,   0, 'C',   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
				{  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},

		};
		//initializes the array the user will modify, whose values will then be compared to the map array
		_newWords = new char[][]{
				{  0,   0,   0,   1,   0,   0,   0,   0,   1,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
				{  0,   0,   0,   1,   0,   0,   0,   0,   1,   1,   1,   1,   1,   1,   1,   0,   0,   0,   0,   0},
				{  0,   0,   0,   1,   0,   0,   0,   0,   1,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
				{  0,   0,   1,   1,   1,   1,   1,   1,   1,   0,   0,   0,   0,   1,   0,   0,   0,   0,   0,   0},
				{  0,   1,   1,   1,   1,   1,   0,   0,   0,   0,   0,   0,   0,   1,   0,   0,   0,   0,   0,   0},
				{  0,   0,   0,   1,   0,   0,   0,   0,   0,   0,   0,   0,   0,   1,   0,   0,   0,   0,   0,   0},
				{  1,   1,   1,   1,   1,   1,   1,   1,   1,   1,   1,   0,   0,   1,   0,   0,   0,   0,   0,   0},
				{  0,   0,   0,   1,   0,   0,   0,   0,   1,   1,   1,   1,   1,   1,   0,   0,   0,   0,   0,   0},
				{  0,   0,   0,   1,   0,   0,   0,   0,   1,   0,   0,   0,   0,   1,   0,   0,   0,   0,   0,   0},
				{  0,   1,   0,   0,   0,   0,   0,   0,   1,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
				{  0,   1,   0,   0,   0,   0,   0,   0,   1,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
				{  0,   1,   1,   1,   1,   1,   1,   1,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
				{  0,   0,   1,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
				{  0,   0,   1,   0,   0,   0,   1,   1,   1,   1,   1,   1,   1,   1,   1,   1,   0,   0,   0,   0},
				{  0,   0,   1,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
				{  0,   0,   1,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
				{  0,   0,   1,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
				{  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0},
		};

		//sets specific values for the characters that will be input
		_trap1 = new Location(0, 3); //1. e
		_trap2 = new Location(0, 8); //2. g
		_trap3 = new Location(1, 8); //3. e
		_trap4 = new Location(3, 2); //4. v
		_trap5 = new Location(3, 13); //5. m  matter down
		_trap6 = new Location(4, 1); //6.v  virus across
		_trap7 = new Location(6, 0); //7.c  chlorophyll across
		_trap8 = new Location(6, 8); //8.y  yeast down
		_trap9 = new Location(7, 8); //9.e  evolve across (7,8)
		_trap10 = new Location(9, 1); //10.d  dna down
		_trap11 = new Location(11, 1); //11.a  abiotic across
		_trap12 = new Location(11, 2); //12. b  biotic down
		_trap13 = new Location(13, 6); //13.d  decomposer across
		_name = JOptionPane.showInputDialog(null, "Type player name. Type Rico to see answers");
	}

	//checks whether the user has correctly filled the crossword
	public boolean completed() {
		for (int r = 0; r < _map.length; r++) {
			for (int c = 0; c < _map[0].length; c++) {
				if (_map[r][c] != _newWords[r][c]) {
					return false;
				}
			}
		}
		return true;
	}

	//methods d1-d13 sets values in the new array if the user guesses the word correctly
	public void d1() {
		_newWords[0][3] = 'E';
		_newWords[1][3] = 'U';
		_newWords[2][3] = 'K';
		_newWords[3][3] = 'A';
		_newWords[4][3] = 'R';
		_newWords[5][3] = 'Y';
		_newWords[6][3] = 'O';
		_newWords[7][3] = 'T';
		_newWords[8][3] = 'E';
	}

	public void d2() {
		_newWords[0][8] = 'G';
		_newWords[1][8] = 'E';
		_newWords[2][8] = 'N';
		_newWords[3][8] = 'E';
	}

	public void d3 () {
		_newWords[1][8] = 'E';
		_newWords[1][9] = 'X';
		_newWords[1][10] = 'T';
		_newWords[1][11] = 'I';
		_newWords[1][12] = 'N';
		_newWords[1][13] = 'C';
		_newWords[1][14] = 'T';
	}

	public void d4() {
		_newWords[3][2] = 'V';
		_newWords[3][3] = 'A';
		_newWords[3][4] = 'C';
		_newWords[3][5] = 'C';
		_newWords[3][6] = 'I';
		_newWords[3][7] = 'N';
		_newWords[3][8] = 'E';
	}

	public void d5() {
		_newWords[3][13] = 'M';
		_newWords[4][13] = 'A';
		_newWords[5][13] = 'T';
		_newWords[6][13] = 'T';
		_newWords[7][13] = 'E';
		_newWords[8][13] = 'R';
	}

	public void d6() {
		_newWords[4][1] = 'V';
		_newWords[4][2] = 'I';
		_newWords[4][3] = 'R';
		_newWords[4][4] = 'U';
		_newWords[4][5] = 'S';
	}

	public void d7() {
		_newWords[6][0] = 'C';
		_newWords[6][1] = 'H';
		_newWords[6][2] = 'L';
		_newWords[6][3] = 'O';
		_newWords[6][4] = 'R';
		_newWords[6][5] = 'O';
		_newWords[6][6] = 'P';
		_newWords[6][7] = 'H';
		_newWords[6][8] = 'Y';
		_newWords[6][9] = 'L';
		_newWords[6][10] = 'L';
	}

	public void d8 () {
		_newWords[6][8] = 'Y';
		_newWords[7][8] = 'E';
		_newWords[8][8] = 'A';
		_newWords[9][8] = 'S';
		_newWords[10][8] = 'T';
	}

	public void d9() {
		_newWords[7][8] = 'E'; //7,8
		_newWords[7][9] = 'V';
		_newWords[7][10] = 'O';
		_newWords[7][11] = 'L';
		_newWords[7][12] = 'V';
		_newWords[7][13] = 'E';
	}

	public void d10() {
		_newWords[9][1] = 'D';
		_newWords[10][1] = 'N';
		_newWords[11][1] = 'A';
	}

	public void d11() {
		_newWords[11][1] = 'A';
		_newWords[11][2] = 'B';
		_newWords[11][3] = 'I';
		_newWords[11][4] = 'O';
		_newWords[11][5] = 'T';
		_newWords[11][6] = 'I';
		_newWords[11][7] = 'C';
	}

	public void d12() {
		_newWords[11][2] = 'B';
		_newWords[12][2] = 'I';
		_newWords[13][2] = 'O';
		_newWords[14][2] = 'T';
		_newWords[15][2] = 'I';
		_newWords[16][2] = 'C';
	}

	public void d13() {
		_newWords[13][6] = 'D';
		_newWords[13][7] = 'E';
		_newWords[13][8] = 'C';
		_newWords[13][9] = 'O';
		_newWords[13][10] = 'M';
		_newWords[13][11] = 'P';
		_newWords[13][12] = 'O';
		_newWords[13][13] = 'S';
		_newWords[13][14] = 'E';
		_newWords[13][15] = 'R';
	}

	//checks whether user last exceeded guess count or not
	public boolean lost (){
		if (getGuessCnt()>5){
			return true;
		}
		else{
			return false;
		}
	}

	//displays message to give user the clue for the word
	public void askQuestion(Player _ply) {
		int t1Row = getTrap1().getRow();
		int t1Col = getTrap1().getCol();
		int t2Row = getTrap2().getRow();
		int t2Col = getTrap2().getCol();
		int t3Row = getTrap3().getRow();
		int t3Col = getTrap3().getCol();
		int t4Row = getTrap4().getRow();
		int t4Col = getTrap4().getCol();
		int t5Row = getTrap5().getRow();
		int t5Col = getTrap5().getCol();
		int t6Row = getTrap6().getRow();
		int t6Col = getTrap6().getCol();
		int t7Row = getTrap7().getRow();
		int t7Col = getTrap7().getCol();
		int t8Row = getTrap8().getRow();
		int t8Col = getTrap8().getCol();
		int t9Row = getTrap9().getRow();
		int t9Col = getTrap9().getCol();
		int t10Row = getTrap10().getRow();
		int t10Col = getTrap10().getCol();
		int t11Row = getTrap11().getRow();
		int t11Col = getTrap11().getCol();
		int t12Row = getTrap12().getRow();
		int t12Col = getTrap12().getCol();
		int t13Row = getTrap13().getRow();
		int t13Col = getTrap13().getCol();
		int pRow = _ply.getLoc().getRow();
		int pCol = _ply.getLoc().getCol();

//call a method after each if statement (or at the end) that prints out the letters?
		if (!_name.equalsIgnoreCase("Rico")) {
			if (pRow == t1Row && pCol == t1Col) {
				String a = JOptionPane.showInputDialog("Hint 1. cells have a nucleus enclosed in nuclear envelope.");
				if (a.equalsIgnoreCase("eukaryote")) {
					d1();
				} else {
					updateGuessCount();
					JOptionPane.showMessageDialog(null, "Total Wrong Guesses: " + getGuessCnt());
				}
			} else if (pRow == t2Row && pCol == t2Col) {
				String b = JOptionPane.showInputDialog("Hint 2. a sequence of DNA that contain genetic information");
				if (b.equalsIgnoreCase("gene")) {
					d2();
				} else {
					updateGuessCount();
					JOptionPane.showMessageDialog(null, "Total Wrong Guesses: " + getGuessCnt());
				}
			} else if (pRow == t3Row && pCol == t3Col) {
				String c = JOptionPane.showInputDialog("Hint 3. when a species no longer exists");
				if (c.equalsIgnoreCase("extinct")) {
					{
						d3();
					}
				} else {
					updateGuessCount();
					JOptionPane.showMessageDialog(null, "Total Wrong Guesses: " + getGuessCnt());
				}
			} else if (pRow == t4Row && pCol == t4Col) {
				String d = JOptionPane.showInputDialog("Hint 4. injects dead virus into body to create antibodies");
				if (d.equalsIgnoreCase("vaccine")) {
					d4();
				} else {
					updateGuessCount();
					JOptionPane.showMessageDialog(null, "Total Wrong Guesses: " + getGuessCnt());
				}
			} else if (pRow == t5Row && pCol == t5Col) {
				String e = JOptionPane.showInputDialog("Hint 5. any substance that has mass and takes up volume");
				if (e.equalsIgnoreCase("matter")) {
					d5();
				} else {
					updateGuessCount();
					JOptionPane.showMessageDialog(null, "Total Wrong Guesses: " + getGuessCnt());
				}
			} else if (pRow == t6Row && pCol == t6Col) {
				String f = JOptionPane.showInputDialog("Hint 6. infectious, nonliving agent that multiplies in organisms and causes illness");
				if (f.equalsIgnoreCase("virus")) {
					d6();
				} else {
					updateGuessCount();
					JOptionPane.showMessageDialog(null, "Total Wrong Guesses: " + getGuessCnt());
				}
			} else if (pRow == t7Row && pCol == t7Col) {
				String g = JOptionPane.showInputDialog("Hint 7. green pigment plants use to absorb light");
				if (g.equalsIgnoreCase("chlorophyll")) {
					d7();
				} else {
					updateGuessCount();
					JOptionPane.showMessageDialog(null, "Total Wrong Guesses: " + getGuessCnt());
				}
			} else if (pRow == t8Row && pCol == t8Col) {
				String h = JOptionPane.showInputDialog("Hint 8. converts sugars to alcohol, is used in your favorite bread ;)");
				if (h.equalsIgnoreCase("yeast")) {
					d8();
				} else {
					updateGuessCount();
					JOptionPane.showMessageDialog(null, "Total Wrong Guesses: " + getGuessCnt());
				}
			} else if (pRow == t9Row && pCol == t9Col) {
				String i = JOptionPane.showInputDialog("Hint 9. change in species traits over several generations, can lead to new species");
				if (i.equalsIgnoreCase("evolve")) {
					d9();
				} else {
					updateGuessCount();
					JOptionPane.showMessageDialog(null, "Total Wrong Guesses: " + getGuessCnt());
				}
			} else if (pRow == t10Row && pCol == t10Col) {
				String j = JOptionPane.showInputDialog("Hint 10. the basic genetic unit composed of nucleotides and sugar phosphate backbone");
				if (j.equalsIgnoreCase("dna")) {
					d10();
				} else {
					updateGuessCount();
					JOptionPane.showMessageDialog(null, "Total Wrong Guesses: " + getGuessCnt());
				}
			} else if (pRow == t11Row && pCol == t11Col) {
				String k = JOptionPane.showInputDialog("Hint 11. non-living components of the environment like rocks and water");
				if (k.equalsIgnoreCase("abiotic")) {
					d11();
				} else {
					updateGuessCount();
					JOptionPane.showMessageDialog(null, "Total Wrong Guesses: " + getGuessCnt());
				}
			} else if (pRow == t12Row && pCol == t12Col) {
				String l = JOptionPane.showInputDialog("Hint 12. living components in an ecosystem, like animals and plants");
				if (l.equalsIgnoreCase("biotic")) {
					d12();
				} else {
					updateGuessCount();
					JOptionPane.showMessageDialog(null, "Total Wrong Guesses: " + getGuessCnt());
				}
			} else if (pRow == t13Row && pCol == t13Col) {
				String m = JOptionPane.showInputDialog("Hint 13. soil organism that breaks down organic material");
				if (m.equalsIgnoreCase("decomposer")) {
					d13();
				} else {
					updateGuessCount();
					JOptionPane.showMessageDialog(null, "Total Wrong Guesses: " + getGuessCnt());
				}
			}
		}
		else
		{
			if (pRow == t1Row && pCol == t1Col) {
				String a = JOptionPane.showInputDialog(" 1. eukaryote.");
				if (a.equalsIgnoreCase("eukaryote")) {
					d1();
				}
			} else if (pRow == t2Row && pCol == t2Col) {
				String b = JOptionPane.showInputDialog(" 2. gene");
				if (b.equalsIgnoreCase("gene")) {
					d2();
				}
			} else if (pRow == t3Row && pCol == t3Col) {
				String c = JOptionPane.showInputDialog(" 3. extinct");
				if (c.equalsIgnoreCase("extinct")) {
					{
						d3();
					}
				}
			} else if (pRow == t4Row && pCol == t4Col) {
				String d = JOptionPane.showInputDialog(" 4. vaccine");
				if (d.equalsIgnoreCase("vaccine")) {
					d4();
				}
			} else if (pRow == t5Row && pCol == t5Col) {
				String e = JOptionPane.showInputDialog(" 5. matter");
				if (e.equalsIgnoreCase("matter")) {
					d5();
				}
			} else if (pRow == t6Row && pCol == t6Col) {
				String f = JOptionPane.showInputDialog(" 6. virus");
				if (f.equalsIgnoreCase("virus")) {
					d6();
				}
			} else if (pRow == t7Row && pCol == t7Col) {
				String g = JOptionPane.showInputDialog(" 7. chlorophyll");
				if (g.equalsIgnoreCase("chlorophyll")) {
					d7();
				}
			} else if (pRow == t8Row && pCol == t8Col) {
				String h = JOptionPane.showInputDialog(" 8. yeast");
				if (h.equalsIgnoreCase("yeast")) {
					d8();
				}
			} else if (pRow == t9Row && pCol == t9Col) {
				String i = JOptionPane.showInputDialog(" 9. evolve");
				if (i.equalsIgnoreCase("evolve")) {
					d9();
				}
			} else if (pRow == t10Row && pCol == t10Col) {
				String j = JOptionPane.showInputDialog(" 10. dna");
				if (j.equalsIgnoreCase("dna")) {
					d10();
				}
			} else if (pRow == t11Row && pCol == t11Col) {
				String k = JOptionPane.showInputDialog(" 11. abiotic");
				if (k.equalsIgnoreCase("abiotic")) {
					d11();
				}
			} else if (pRow == t12Row && pCol == t12Col) {
				String l = JOptionPane.showInputDialog(" 12. biotic");
				if (l.equalsIgnoreCase("biotic")) {
					d12();
				}
			} else if (pRow == t13Row && pCol == t13Col) {
				String m = JOptionPane.showInputDialog(" 13. decomposer");
				if (m.equalsIgnoreCase("decomposer")) {
					d13();
				}
			}
		}
		//check if they lost

	}






}

