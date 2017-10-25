package rit.ldom;

public abstract class DocUnit implements Component{

    public static int DEFAULT_ID;

    protected DocUnit(){}

    protected DocUnit(int id){
        this.DEFAULT_ID = id;
    }

    public int getID(){
        return DEFAULT_ID;
    }
}
