package rit.ldom;

public class SimpleText implements Text {

    private String realText;

    public SimpleText(String realText){
        this.realText = realText;
    }

    public String generateHTML(){
        return this.realText;
    }

    public long characterCount(){
        long result = 0;
        for (char c : this.realText.toCharArray()){
            if (!Character.isWhitespace(c)){
                result += 1;
            }
        }
        return result;
    }

    public void replace(String oldS, String newS){
        this.realText = this.realText.replace(oldS, newS);
    }
}
