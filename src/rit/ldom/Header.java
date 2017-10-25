package rit.ldom;

public class Header extends SimpleDocUnit {

    private int lvl;

    public Header(int level, TextSequence textSeq){
        super(textSeq);
        this.lvl = level;
    }

    public Header(int id, int level, TextSequence textSeq){
        super(id, textSeq);
        this.lvl = level;
    }

    public String generateHTML(){
        return "<h" + this.lvl + ">" + super.generateHTML() + "</h" + this.lvl + ">\n";
    }
}
