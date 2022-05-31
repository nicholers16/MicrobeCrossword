package viewcon;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.util.Random;

import javax.swing.*;

import cnt.KeyController;
import mod.Maze;
import mod.Player;

public class MazeWindow {

    private JFrame _frame;
    private MazePanel _pan;
    private Maze _maze;
    private Player _ply;
    private KeyController _kcnt;
    private static final int X_POS = 700;
    private static final int Y_POS = 300;

    public JFrame getFrame() { return _frame; }

    //initializes the frame that holds the crossword
    public MazeWindow(Maze m, Player p, KeyController k) {
        _maze = m;
        _ply = p;
        _pan = new MazePanel(_maze, _ply);
        _kcnt = k;
        setupFrame();
    }

    //uses instantiated constraints to create the frame with tools for the user
    private void setupFrame() {
        JPanel pan = _pan.getPanel();
        _frame = new JFrame("Microbes Crossword. ");
        _frame.setLayout(new GridLayout(1,1));
        _frame.setLocation(X_POS, Y_POS);
        _frame.setSize(pan.getWidth(), pan.getHeight());
        _frame.addKeyListener(_kcnt);
        _frame.add(pan);
        _frame.setResizable(true);
        _frame.setAlwaysOnTop(false);
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frame.setVisible(true);
    }

    //removes the previous panel values and updates it with the outcome of the user input for the crossword
    public void reDraw() {
        _frame.remove(_pan.getPanel());
        _frame.add(_pan.getPanel());
        _frame.repaint();
        _frame.setVisible(true);

    }

}
