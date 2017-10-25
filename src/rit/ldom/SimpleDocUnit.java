package rit.ldom;

public abstract class SimpleDocUnit extends DocUnit{

    private TextSequence textsequence;

    protected SimpleDocUnit(int id, TextSequence textSeq){
        super(id);
        this.textsequence = textSeq;
    }

    protected SimpleDocUnit(TextSequence textSeq){
        this.textsequence = textSeq;
    }

    public TextSequence getTextSeq(){
        return this.textsequence;
    }

    public String generateHTML(){
        return this.textsequence.generateHTML();
    }

    public long characterCount(){
        return this.textsequence.characterCount();
    }

    public void replace(String oldS, String newS){
        this.textsequence.replace(oldS, newS);
    }

}
