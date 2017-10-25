package rit.ldom;

public class Paragraph extends SimpleDocUnit {

    public Paragraph(int id, TextSequence textSeq){
        super(id, textSeq);
    }

    public String generateHTML(){
        return "<p>" + super.generateHTML() + "</p>\n";
    }
}
