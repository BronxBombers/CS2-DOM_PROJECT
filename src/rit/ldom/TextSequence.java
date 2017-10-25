package rit.ldom;
import java.util.ArrayList;

public class TextSequence implements Component{

    private ArrayList<Text> children;

    public TextSequence(){
        children = new ArrayList<>();
    }

    public void addChild(Text text){
        children.add(text);
    }

    public Iterable<Text> getChildren(){
        return children;
    }

    public String generateHTML(){
        String html = "";
        for (Text text : this.children){
            html += text.generateHTML();
        }
        return html;
    }

    public long characterCount(){
        long count = 0;
        for (Text text : this.children){
            count += text.characterCount();
        }
        return count;
    }

    public void replace(String oldS, String newS){
        for (Text text : this.children){
            text.replace(oldS, newS);
        }
    }
}
