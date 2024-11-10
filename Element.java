package cmsc123Lab5;
public class Element{
    // declares variables
    public String value;
    public int index;
    
    public Element(int index,String value){
        // constructor
        this.value = value;
        this.index = index;
    }

    public void setValue(String value){
        // sets value
        this.value = value;
    }

    public String getValue(){
        // gets value
        return this.value;
    }
    
    public void setIndex(int index) {
        this.index = index;
    }
    
    public int getIndex() {
        return this.index;
    }
}