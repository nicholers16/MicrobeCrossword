package viewcon;

import java.awt.GridLayout;

import javax.swing.*;

import mod.Direction;
import mod.Maze;
import mod.Player;

public class MazePanel {

    private JPanel _pan;
    private JLabel[][] _labs;
    private Maze _maze;
    private Player _ply;
    private static final int PIXELS = 35;

    //displays visual crossword puzzle that updates with user input
    public MazePanel(Maze m, Player p) {
        _maze = m;
        _ply = p;
        setupLabs();
        setupJPanel();
    }

    //returns the panel after refreshing it
    public JPanel getPanel() {
        drawPanel();
        return _pan;
    }

    //creates panel based on crossword board constraints
    private void setupJPanel() {
        int numRows = _labs.length;
        int numCols = _labs[0].length;
        _pan = new JPanel(new GridLayout(numRows, numCols));
        int rowSize = _maze.getMap().length * PIXELS;
        int colSize = _maze.getMap()[0].length * PIXELS;
        _pan.setSize(rowSize, colSize);
    }

    //redraws the panel with new user input
    private void drawPanel() {
        this._pan.removeAll();
        this.drawMap();
        JLabel[][] var4;
        int var3 = (var4 = this._labs).length;

        for (int var2 = 0; var2 < var3; ++var2) {
            JLabel[] arr = var4[var2];
            JLabel[] var8 = arr;
            int var7 = arr.length;

            for (int var6 = 0; var6 < var7; ++var6) {
                JLabel lab = var8[var6];
                this._pan.add(lab);
                this._pan.repaint();
            }
        }

    }

    //assigns Jlabel value to each element of the array displayed on the pael
    private void setupLabs() {
        int row = _maze.getMap().length;
        int col = _maze.getMap()[0].length;
        _labs = new JLabel[row][col];
    }

    //assigns the png of the letter to the respective jlabel
    private void abcs(int r, int c) {
        char[][] nw = _maze.getNewWords();
        if (nw[r][c] == 'A') {
            _labs[r][c] = new JLabel(Graphics.A.getImage());
        } else if (nw[r][c] == 'B') {
            _labs[r][c] = new JLabel(Graphics.B.getImage());
        } else if (nw[r][c] == 'C') {
            _labs[r][c] = new JLabel(Graphics.C.getImage());
        } else if (nw[r][c] == 'D') {
            _labs[r][c] = new JLabel(Graphics.D.getImage());
        } else if (nw[r][c] == 'E') {
            _labs[r][c] = new JLabel(Graphics.E.getImage());
        } else if (nw[r][c] == 'F') {
            _labs[r][c] = new JLabel(Graphics.F.getImage());
        } else if (nw[r][c] == 'G') {
            _labs[r][c] = new JLabel(Graphics.G.getImage());
        } else if (nw[r][c] == 'H') {
            _labs[r][c] = new JLabel(Graphics.H.getImage());
        } else if (nw[r][c] == 'I') {
            _labs[r][c] = new JLabel(Graphics.I.getImage());
        } else if (nw[r][c] == 'J') {
            _labs[r][c] = new JLabel(Graphics.J.getImage());
        } else if (nw[r][c] == 'K') {
            _labs[r][c] = new JLabel(Graphics.K.getImage());
        } else if (nw[r][c] == 'L') {
            _labs[r][c] = new JLabel(Graphics.L.getImage());
        } else if (nw[r][c] == 'M') {
            _labs[r][c] = new JLabel(Graphics.M.getImage());
        } else if (nw[r][c] == 'N') {
            _labs[r][c] = new JLabel(Graphics.N.getImage());
        } else if (nw[r][c] == 'O') {
            _labs[r][c] = new JLabel(Graphics.O.getImage());
        } else if (nw[r][c] == 'P') {
            _labs[r][c] = new JLabel(Graphics.P.getImage());
        } else if (nw[r][c] == 'Q') {
            _labs[r][c] = new JLabel(Graphics.Q.getImage());
        } else if (nw[r][c] == 'R') {
            _labs[r][c] = new JLabel(Graphics.R.getImage());
        } else if (nw[r][c] == 'S') {
            _labs[r][c] = new JLabel(Graphics.S.getImage());
        } else if (nw[r][c] == 'T') {
            _labs[r][c] = new JLabel(Graphics.T.getImage());
        } else if (nw[r][c] == 'U') {
            _labs[r][c] = new JLabel(Graphics.U.getImage());
        } else if (nw[r][c] == 'V') {
            _labs[r][c] = new JLabel(Graphics.V.getImage());
        } else if (nw[r][c] == 'W') {
            _labs[r][c] = new JLabel(Graphics.W.getImage());
        } else if (nw[r][c] == 'X') {
            _labs[r][c] = new JLabel(Graphics.X.getImage());
        } else if (nw[r][c] == 'Y') {
            _labs[r][c] = new JLabel(Graphics.Y.getImage());
        } else if (nw[r][c] == 'Z') {
            _labs[r][c] = new JLabel(Graphics.Z.getImage());
        }


    }

    //assigns the png of the letter to the respective jlabel when the user is hovering over it
    private void hoverabcs(int r, int c) {
        char[][] nw = _maze.getNewWords();
        if (nw[r][c] == 'A') {
            _labs[r][c] = new JLabel(Graphics.AWH.getImage());
        } else if (nw[r][c] == 'B') {
            _labs[r][c] = new JLabel(Graphics.BWH.getImage());
        } else if (nw[r][c] == 'C') {
            _labs[r][c] = new JLabel(Graphics.CWH.getImage());
        } else if (nw[r][c] == 'D') {
            _labs[r][c] = new JLabel(Graphics.DWH.getImage());
        } else if (nw[r][c] == 'E') {
            _labs[r][c] = new JLabel(Graphics.EWH.getImage());
        } else if (nw[r][c] == 'F') {
            _labs[r][c] = new JLabel(Graphics.FWH.getImage());
        } else if (nw[r][c] == 'G') {
            _labs[r][c] = new JLabel(Graphics.GWH.getImage());
        } else if (nw[r][c] == 'H') {
            _labs[r][c] = new JLabel(Graphics.HWH.getImage());
        } else if (nw[r][c] == 'I') {
            _labs[r][c] = new JLabel(Graphics.IWH.getImage());
        } else if (nw[r][c] == 'J') {
            _labs[r][c] = new JLabel(Graphics.JWH.getImage());
        } else if (nw[r][c] == 'K') {
            _labs[r][c] = new JLabel(Graphics.KWH.getImage());
        } else if (nw[r][c] == 'L') {
            _labs[r][c] = new JLabel(Graphics.LWH.getImage());
        } else if (nw[r][c] == 'M') {
            _labs[r][c] = new JLabel(Graphics.MWH.getImage());
        } else if (nw[r][c] == 'N') {
            _labs[r][c] = new JLabel(Graphics.NWH.getImage());
        } else if (nw[r][c] == 'O') {
            _labs[r][c] = new JLabel(Graphics.OWH.getImage());
        } else if (nw[r][c] == 'P') {
            _labs[r][c] = new JLabel(Graphics.PWH.getImage());
        } else if (nw[r][c] == 'Q') {
            _labs[r][c] = new JLabel(Graphics.QWH.getImage());
        } else if (nw[r][c] == 'R') {
            _labs[r][c] = new JLabel(Graphics.RWH.getImage());
        } else if (nw[r][c] == 'S') {
            _labs[r][c] = new JLabel(Graphics.SWH.getImage());
        } else if (nw[r][c] == 'T') {
            _labs[r][c] = new JLabel(Graphics.TWH.getImage());
        } else if (nw[r][c] == 'U') {
            _labs[r][c] = new JLabel(Graphics.UWH.getImage());
        } else if (nw[r][c] == 'V') {
            _labs[r][c] = new JLabel(Graphics.VWH.getImage());
        } else if (nw[r][c] == 'W') {
            _labs[r][c] = new JLabel(Graphics.WWH.getImage());
        } else if (nw[r][c] == 'X') {
            _labs[r][c] = new JLabel(Graphics.XWH.getImage());
        } else if (nw[r][c] == 'Y') {
            _labs[r][c] = new JLabel(Graphics.YWH.getImage());
        } else if (nw[r][c] == 'Z') {
            _labs[r][c] = new JLabel(Graphics.ZWH.getImage());
        }


    }

    //draws the map with the respective png values
    private void drawMap() {
        int pRow = _ply.getLoc().getRow();
        int pCol = _ply.getLoc().getCol();
        int t1Row = _maze.getTrap1().getRow();
        int t1Col = _maze.getTrap1().getCol();
        int t2Row = _maze.getTrap2().getRow();
        int t2Col = _maze.getTrap2().getCol();
        int t3Row = _maze.getTrap3().getRow();
        int t3Col = _maze.getTrap3().getCol();
        int t4Row = _maze.getTrap4().getRow();
        int t4Col = _maze.getTrap4().getCol();
        int t5Row = _maze.getTrap5().getRow();
        int t5Col = _maze.getTrap5().getCol();
        int t6Row = _maze.getTrap6().getRow();
        int t6Col = _maze.getTrap6().getCol();
        int t7Row = _maze.getTrap7().getRow();
        int t7Col = _maze.getTrap7().getCol();
        int t8Row = _maze.getTrap8().getRow();
        int t8Col = _maze.getTrap8().getCol();
        int t9Row = _maze.getTrap9().getRow();
        int t9Col = _maze.getTrap9().getCol();
        int t10Row = _maze.getTrap10().getRow();
        int t10Col = _maze.getTrap10().getCol();
        int t11Row = _maze.getTrap11().getRow();
        int t11Col = _maze.getTrap11().getCol();
        int t12Row = _maze.getTrap12().getRow();
        int t12Col = _maze.getTrap12().getCol();
        int t13Row = _maze.getTrap13().getRow();
        int t13Col = _maze.getTrap13().getCol();

        char[][] user = _maze.getNewWords();
        int row = _labs.length;
        int col = _labs[0].length;

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (r == pRow && c == pCol) {
                    if (user[r][c] == 1) {
                        _labs[r][c] = new JLabel(Graphics.WH.getImage()); //white hover
                    } else if (user[r][c] == 0) {
                        _labs[r][c] = new JLabel(Graphics.BH.getImage());
                    } else {
                        hoverabcs(r, c);
                        //make abcs with a hover on top of it
                    }
                } else if (r == t1Row && c == t1Col && user[r][c] == 'E') {
                    _labs[r][c] = new JLabel(Graphics.TL1.getImage());
                } else if (r == t1Row && c == t1Col && user[r][c] != 'E') {
                    _labs[r][c] = new JLabel(Graphics.T1.getImage());
                } else if (r == t2Row && c == t2Col && user[r][c] != 'G') {
                    _labs[r][c] = new JLabel(Graphics.T2.getImage());
                } else if (r == t2Row && c == t2Col && user[r][c] == 'G') {
                    _labs[r][c] = new JLabel(Graphics.TL2.getImage());
                } else if (r == t3Row && c == t3Col && user[r][c] != 'E') {
                    _labs[r][c] = new JLabel(Graphics.T3.getImage());
                } else if (r == t3Row && c == t3Col && user[r][c] == 'E') {
                    _labs[r][c] = new JLabel(Graphics.TL3.getImage());
                } else if (r == t4Row && c == t4Col && user[r][c] != 'V') {
                    _labs[r][c] = new JLabel(Graphics.T4.getImage());
                } else if (r == t4Row && c == t4Col && user[r][c] == 'V') {
                    _labs[r][c] = new JLabel(Graphics.TL4.getImage());
                } else if (r == t5Row && c == t5Col && user[r][c] != 'M') {
                    _labs[r][c] = new JLabel(Graphics.T5.getImage());
                } else if (r == t5Row && c == t5Col && user[r][c] == 'M') {
                    _labs[r][c] = new JLabel(Graphics.TL5.getImage());
                } else if (r == t6Row && c == t6Col && user[r][c] != 'V') {
                    _labs[r][c] = new JLabel(Graphics.T6.getImage());
                } else if (r == t6Row && c == t6Col && user[r][c] == 'V') {
                    _labs[r][c] = new JLabel(Graphics.TL6.getImage());
                } else if (r == t7Row && c == t7Col && user[r][c] != 'C') {
                    _labs[r][c] = new JLabel(Graphics.T7.getImage());
                } else if (r == t7Row && c == t7Col && user[r][c] == 'C') {
                    _labs[r][c] = new JLabel(Graphics.TL7.getImage());
                } else if (r == t8Row && c == t8Col && user[r][c] != 'Y') {
                    _labs[r][c] = new JLabel(Graphics.T8.getImage());
                } else if (r == t8Row && c == t8Col && user[r][c] == 'Y') {
                    _labs[r][c] = new JLabel(Graphics.TL8.getImage());
                } else if (r == t9Row && c == t9Col && user[r][c] != 'E') {
                    _labs[r][c] = new JLabel(Graphics.T9.getImage());
                } else if (r == t9Row && c == t9Col && user[r][c] == 'E') {
                    _labs[r][c] = new JLabel(Graphics.TL9.getImage());
                } else if (r == t10Row && c == t10Col && user[r][c] != 'D') {
                    _labs[r][c] = new JLabel(Graphics.T10.getImage());
                } else if (r == t10Row && c == t10Col && user[r][c] == 'D') {
                    _labs[r][c] = new JLabel(Graphics.TL10.getImage());
                } else if (r == t11Row && c == t11Col && user[r][c] != 'A') {
                    _labs[r][c] = new JLabel(Graphics.T11.getImage());
                } else if (r == t11Row && c == t11Col && user[r][c] == 'A') {
                    _labs[r][c] = new JLabel(Graphics.TL11.getImage());
                } else if (r == t12Row && c == t12Col && user[r][c] != 'B') {
                    _labs[r][c] = new JLabel(Graphics.T12.getImage());
                } else if (r == t12Row && c == t12Col && user[r][c] == 'B') {
                    _labs[r][c] = new JLabel(Graphics.TL12.getImage());
                } else if (r == t13Row && c == t13Col && user[r][c] != 'D') {
                    _labs[r][c] = new JLabel(Graphics.T13.getImage());
                } else if (r == t13Row && c == t13Col && user[r][c] == 'D') {
                    _labs[r][c] = new JLabel(Graphics.TL13.getImage());
                }else if (user[r][c] != 0 && user[r][c] != 1) {
                    abcs(r, c);
                }
                else if (user[r][c] == 1) {
                    _labs[r][c] = new JLabel(Graphics.PATH.getImage());
                } else if (user[r][c] == 0) {
                    _labs[r][c] = new JLabel(Graphics.WALL.getImage());
                }
            }
        }
    }

}
