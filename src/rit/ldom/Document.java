package rit.ldom;
import java.util.ArrayList;
import java.util.ArrayList;

public class Document implements Component {

    private String title;

    private ArrayList<DocUnit> children;

    public Document(String title){
        this.title = title;
        this.children = new ArrayList<>();
    }

    public void addChild(DocUnit docUnit){
        children.add(docUnit);
    }

    public Iterable<DocUnit> getChildren(){
        return this.children;
    }

    public String generateHTML(){
        String HTML = "<html>\n    <head>\n        <title>" + this.title + "</title>\n    </head>\n    <body>\n";
        for (DocUnit child : children){
            HTML += "        " + child.generateHTML();
        }
        return HTML;
    }

    public long characterCount() {
        long sum = 0;
        for (DocUnit child : children) {
            sum += child.characterCount();
        }
        return sum;
    }

    public void replace(String oldS, String newS){
        for (DocUnit child : children){
            child.replace(oldS, newS);
        }
    }

    public void replace(int docUnitID, DocUnit docUnit){
        for (DocUnit child : children){
            if (child.getID() == docUnitID){
                int index = children.indexOf(child);
                children.set(index, docUnit);
            }
        }
    }
}
