package cmsc123Lab5;

public class Array {
    // REQUIRED
    private int size;
    private int capacity;
    private Element[] contents;

    public Array(int i) {
        this.size = 0;
        this.capacity = 10;
        this.contents = new Element[capacity];
    }

    public int getSize() {
        return this.size;
    }
    
    public int getCapacity() {
    	return this.capacity;
    }
    public Element[] getContents() {
        return this.contents;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void addElement(String value) {
        if (this.size == this.capacity) {
            expand();
            Element[] tempList = new Element[this.capacity];
            for (int i = 0; i < this.size; i++) {
                tempList[i] = this.contents[i];
            }
            this.contents = tempList;
        }
        this.contents[this.size] = new Element(size,value);
        this.size++;
    }

    public String removeElement(int index) {
        // REQUIRED
        if (index < 0 || index >= this.size) {
            System.out.println("Index out of bounds");
            return null;
        }
        String value = this.contents[index].getValue();
        System.arraycopy(this.contents, index + 1, this.contents, index, this.size - index - 1);
        this.size--;
        return value;
    }

	public void expand() {
		this.capacity+=5;
		Element[] tempArray=new Element[capacity];
		for(int i=0; i<size; i++) {
			tempArray[i]=this.contents[i];
		}
		this.contents=tempArray;
	}
	
	public void incrementSize() {
		this.size++;
	}
	
	public void decrementSize() {
		this.size--;
	}
}