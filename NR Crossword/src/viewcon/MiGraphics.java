package viewcon;

import javax.swing.ImageIcon;

public enum MiGraphics {

    //this class holds graphics for the win message, which displays a randomly
    //generated "microbe" to the user
    AMO("amoeba.png"),
    ASP ("aspergillosis.png"),
    DIA("diatom.png"),
    STAPH("staphylocuccus.png");


    public static MiGraphics getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
    private ImageIcon _img;

    public ImageIcon getMiImage(){ return _img; }

    private MiGraphics(String fName) {
        _img = new ImageIcon(getClass().getResource(fName));
    }
}