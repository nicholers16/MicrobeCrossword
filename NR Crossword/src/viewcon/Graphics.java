package viewcon;

import javax.swing.ImageIcon;

public enum Graphics {

    //this class holds the variable names for illustrations uploaded as pngs
    WALL("wall.png"),
    RICO ("rico.png"),
    PUP("nathanthony.png"),
    PATH("path.png"),
    T1 ("p1.png"),
    T2 ("p2.png"),
    T3 ("p3.png"),
    T4 ("p4.png"),
    T5 ("p5.png"),
    T6 ("p6.png"),
    T7 ("p7.png"),
    T8 ("p8.png"),
    T9("p9.png"),
    T10 ("p10.png"),
    T11 ("p11.png"),
    T12("p12.png"),
    T13("p13.png") ,
    A ("a.png"), B ("b.png"), C ("c.png"), D("d.png"), E("e.png"),
    F("f.png"), G("g.png"), H("h.png"), I("i.png"), J("j.png"),
    K("k.png"), L("l.png"), M("m.png"), N("n.png"), O("o.png"),
    P("p.png"), Q ("q.png"), R ("r.png"), S("s.png"), T("t.png"),
    U("u.png"), V("v.png"), W("w.png"), X("x.png"), Y("y.png"), Z("z.png"),

    AWH ("awh.png"), BWH ("bwh.png"), CWH ("cwh.png"), DWH("dwh.png"), EWH("ewh.png"),
    FWH("fwh.png"), GWH("gwh.png"), HWH("hwh.png"), IWH("iwh.png"), JWH("jwh.png"),
    KWH("kwh.png"), LWH("lwh.png"), MWH("mwh.png"), NWH("nwh.png"), OWH("owh.png"),
    PWH("pwh.png"), QWH ("qwh.png"), RWH ("rwh.png"), SWH("swh.png"), TWH("twh.png"),
    UWH("uwh.png"), VWH("vwh.png"), WWH("wwh.png"), XWH("xwh.png"), YWH("ywh.png"), ZWH("zwh.png"),

    WH ("whitehover.png"),
    BH ("blackhover.png"),
    TL1 ("t1e.png"),
    TL2("t2g.png"),
    TL3("t3e.png"),
    TL4("t4v.png"),
    TL5("t5m.png"),
    TL6("t6v.png"),
    TL7("t7c.png"),
    TL8("t8y.png"),
    TL9("t9e.png"),
    TL10("t10d.png"),
    TL11("t11a.png"),
    TL12("t12b.png"),
    TL13("t13d.png")
    ;

    private ImageIcon _img;

    public ImageIcon getImage(){ return _img; }

    Graphics(String fName) {
        _img = new ImageIcon(getClass().getResource(fName));
    }
}