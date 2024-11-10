package cmsc123Lab5;

public class ArrayBT extends Array{
	// Note that class "ArrayBT" inherits the class "Array" attributes and methods
	// The root of the Array Binary Tree is stored at index 1
	int rootIndex;
	
	public ArrayBT(int capacity){
		// REQUIRED
		super(capacity);
		this.rootIndex=1;
	}
		
	public void setRoot(Element e){
		// REQUIRED
		if(isEmpty()) {
			getContents()[1]=e;
		}
	}

	public Element getRoot(){
		// REQUIRED
		return getContents()[1];
	}

	public void setLeft(int parentIndex, Element e) {
	    // Note that the left child of a node is stored at INDEX: (2*index)
	    // REQUIRED
	    if (parentIndex < getContents().length && getContents()[parentIndex] != null) {
	        int leftIndex = 2 * parentIndex;
	        if (leftIndex < getContents().length) {
	            getContents()[leftIndex] = e;
	        }
	    } else {
	        System.out.println("Parent node does not exist at index");
	    }
	}
	
	public void setRight(int parentIndex, Element e) {
	    // Note that the right child of a node is stored at INDEX: (2*index) + 1
	    // REQUIRED
	    if (parentIndex < getContents().length && getContents()[parentIndex] != null) {
	        int rightIndex = 2 * parentIndex + 1;
	        if (rightIndex < getContents().length) {
	            getContents()[rightIndex] = e;
	        }
	    } else {
	        System.out.println("Parent node does not exist");
	    }
	}  
	    
	// Tree Traversals
	public void inorder(int rootIndex){
		// left -> root -> right
		// This will print the values of the ArrayBT using the inorder traversal
		// REQUIRED
		if (rootIndex < getContents().length && getContents()[rootIndex] != null) {
            inorder(2 * rootIndex); 
            System.out.print(getContents()[rootIndex] + " "); 
            inorder(2 * rootIndex + 1); 
        }
	}

	public void preorder(int rootIndex){
		// root -> left -> right
		// This will print the values of the ArrayBT using the preorder traversal
		// REQUIRED
		if (rootIndex < getContents().length && getContents()[rootIndex] != null) {
            System.out.print(getContents()[rootIndex] + " "); 
			preorder(2 * rootIndex); 
            preorder(2 * rootIndex + 1); 
        }
	}

	public void postorder(int rootIndex){
		// left -> right -> root
		// This will print the values of the ArrayBT using the postorder traversal
		// REQUIRED
		if (rootIndex < getContents().length && getContents()[rootIndex] != null) {
            postorder(2 * rootIndex); 
            postorder(2 * rootIndex + 1); 
            System.out.print(getContents()[rootIndex] + " "); 
        }
	}
}