package rit.ldom;
import java.util.List;

public class Listing extends DocUnit {

    private boolean ordered;

    private List<TextSequence> tSeqs;

    public Listing(int id, boolean ordered, List<TextSequence> tSeqs){
        super(id);
        this.ordered = ordered;
        this.tSeqs = tSeqs;
    }

    public Iterable<TextSequence> getChildren(){
        return tSeqs;
    }

    public String generateHTML(){
        String HTML = "";
        if (ordered){
            HTML += "<ol>\n";
            for (TextSequence textS : tSeqs){
                HTML += "    <li>" + textS.generateHTML() + "</li>\n";
            }
            HTML += "</ol>\n";
        }
        else{
            HTML += "<ul>\n";
            for (TextSequence textS : tSeqs){
                HTML += "    <li>" + textS.generateHTML() + "</li>\n";
            }
            HTML += "</ul>\n";
        }
        return HTML;
    }

    public long characterCount(){
        long Sum = 0;
        for (TextSequence textS : tSeqs){
            Sum += textS.characterCount();
        }
        return Sum;
    }

    public void replace(String oldS, String newS){
        for (TextSequence textS : tSeqs){
            textS.replace(oldS, newS);
        }
    }
}
