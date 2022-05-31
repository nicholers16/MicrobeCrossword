package cnt;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import viewcon.MiGraphics;
import viewcon.Graphics;

//import javax.activation.MailcapCommandMap;
import javax.swing.*;

import mod.*;
import viewcon.MazeWindow;

public class KeyController implements KeyListener {

    private Player _ply;
    private Maze _maze;
    private MazeWindow _win;
    private String _name;

    //initializes board of crossword and user information
    public KeyController() {
        intro();
        _maze = new Maze();
        _ply = new Player(new Location(0,0));
        _win = new MazeWindow(_maze, _ply, this);
        _name = _maze.getName();
    }

    //displays win message
    private void win() {
        ImageIcon iAmSoTired;
        if (_name.equalsIgnoreCase("Rico"))
        {
            iAmSoTired = Graphics.RICO.getImage();
            JOptionPane.showMessageDialog(this._win.getFrame(),  new JLabel(Graphics.RICO.getImage()), "You won!", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            iAmSoTired = MiGraphics.getRandom().getMiImage();
            JOptionPane.showMessageDialog(this._win.getFrame(),  new JLabel(iAmSoTired), "You won!", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }

    //displays lose message
    private void lose() {
        JOptionPane.showMessageDialog(null, "You lost! Better luck next time");
        System.exit(0);
    }


    @Override
    public void keyPressed(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

    //opens clue messages based on user input in moving around
    @Override
    public void keyReleased(KeyEvent key) {
        // TODO Auto-generated method stub
        if(key.getKeyCode() == 38) {
            if(_ply.isValid(_maze, Direction.UP)) {
                _ply.move( Direction.UP);
                _maze.askQuestion(_ply);
                _win.reDraw();
            }
        }
        else if(key.getKeyCode() == 37) {
            if(_ply.isValid(_maze, Direction.LEFT)) {
                _ply.move( Direction.LEFT);
                _maze.askQuestion(_ply);
                _win.reDraw();
            }
        }
        else if(key.getKeyCode() == 40) {
            if(_ply.isValid(_maze, Direction.DOWN)) {
                _ply.move(Direction.DOWN);
                _maze.askQuestion(_ply);
                _win.reDraw();

            }
        }
        else if(key.getKeyCode() == 39) {
            if(_ply.isValid(_maze, Direction.RIGHT)) {
                _ply.move( Direction.RIGHT);
                _maze.askQuestion(_ply);
                _win.reDraw();
            }
        }
        if(_maze.completed()) {
            win();
        }
        else if(_maze.lost())
        {
            lose();
        }

    }


    @Override
    public void keyTyped(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

    //introductions 1-2 display intro messages explaining the goal of the crossword
    public static void introduction1() {
        JPanel panel = new JPanel();

        JLabel a = new JLabel("Microbes are tiny organisms that were one of our first ancestors.");
        JLabel b = new JLabel("They've evolved for millions of years into fungi, bacteria, protists and more.");
        JLabel c = new JLabel("This crossword will test your knowledge on these mighty microbes.");
        JLabel d = new JLabel("Based on your 'knowledge', the crossword will guess what kind of microbe you are! ");
        JLabel e = new JLabel(" ");
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(a);
        panel.add(e);
        panel.add(b);
        panel.add(c);
        panel.add(d);
        panel.setBackground(new Color(142, 190, 193));
        JOptionPane.showMessageDialog(null, panel, "Test your Microbe Knowledge!", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void introduction2() {
        JPanel panel = new JPanel();

        JLabel a = new JLabel("Time to put that good old eighth grade science knowledge to the test...");
        JLabel b = new JLabel("If you guess the word wrong more than 5 times, you DIE!");
        JLabel c = new JLabel("Don't mess up. Seriously, how hard can it be?");
        JLabel e = new JLabel(" ");
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(a);
        panel.add(b);
        panel.add(e);
        panel.add(c);
        panel.setBackground(new Color(142, 190, 193));
        JOptionPane.showMessageDialog(null, panel, "Test your Microbe Knowledge!", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void introduction3() {
        JPanel panel = new JPanel();
        JLabel a = new JLabel("Here's a word bank to refresh your memory:");
        JLabel b = new JLabel("Down");
        JLabel c = new JLabel("eukaryote,gene,dna, biotic, yeast, matter");
        JLabel d = new JLabel("Across");
        JLabel e = new JLabel("vaccine, virus, chlorophyll, evolve, abiotic, decomposer. ");
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(a);
        panel.add(b);
        panel.add(c);
        panel.add(d);
        panel.add(e);
        panel.setBackground(new Color(142, 190, 193));
        JOptionPane.showMessageDialog(null, panel, "Test your Microbe Knowledge!", JOptionPane.INFORMATION_MESSAGE);
    }

    //helper method that accumulates intro messages
    public  void intro ()
    {
        introduction1();
        introduction2();
        introduction3();
    }








}

