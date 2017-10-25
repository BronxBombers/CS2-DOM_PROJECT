package rit.ldom;

public class StyledText implements Text {

    private Style style;

    private Text text;

    public StyledText(Style style, Text text){
        this.style = style;
        this.text = text;
    }

    public Text getText(){
        return this.text;
    }

    public String generateHTML(){
        String HTML = "";
        switch (style){
            case bold:
                HTML += "<b>" + this.text.generateHTML() + "</b>";
                break;
            case italic:
                HTML += "<i>" + this.text.generateHTML() + "</i>";
                break;
            case underline:
                HTML += "<u>" + this.text.generateHTML() + "</u>";
                break;
        }
        return HTML;
    }

    public long characterCount() {
        return this.text.characterCount();
    }

    public void replace(String oldS, String newS){
        this.text.replace(oldS, newS);
    }
}
