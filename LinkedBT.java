package cmsc123Lab5;

public class LinkedBT{
	// insert "LinkedBT" attributes
	int size;
	BTNode rootNode;
	
	public LinkedBT(){
		// REQUIRED
		this.size=0;
		this.rootNode=null;
	}

	public int getSize(){
		// REQUIRED
		return this.size;
	}

	public boolean isEmpty(){
		// REQUIRED
		return size==0;
	}
		
	public void setRoot(BTNode rootNode){
		// REQUIRED
		if(isEmpty()) {
			this.rootNode=rootNode;
			this.size=1;
		}
	}

	public BTNode getRoot(){
		// REQUIRED
		return this.rootNode;
	}

	public void setLeft(BTNode parentNode, String value){
		// REQUIRED
		 if (parentNode != null) {
			 BTNode newNode = new BTNode(value);	
			 parentNode.setLeft(newNode);
		     newNode.setParent(parentNode);
		     this.size++; 
		 }
	}

	public void setRight(BTNode parentNode, String value){
		// REQUIRED
		if (parentNode != null) {
	        BTNode newNode = new BTNode(value);
	        parentNode.setRight(newNode);
	        newNode.setParent(parentNode);
	        this.size++; 
	    }
	}

	// Tree Traversals
	public void inorder(BTNode rootNode){
		// left -> root -> right
		// This will print the values of the LinkedBT using the inorder traversal
		// REQUIRED
		if(rootNode!=null) {
			inorder(rootNode.getLeft());
			System.out.print(rootNode.getValue() + " ");  // Visit node (root)
	        inorder(rootNode.getRight());
		}
	}

	public void preorder(BTNode rootNode){
		// root -> left -> right
		// This will print the values of the LinkedBT using the preorder traversal
		// REQUIRED
		if(rootNode!=null) {
			System.out.print(rootNode.getValue() + " ");  // Visit node (root)
			preorder(rootNode.getLeft());
	        preorder(rootNode.getRight());
		}
	}

	public void postorder(BTNode rootNode){
		// left -> right -> root
		// This will print the values of the LinkedBT using the postorder traversal
		// REQUIRED
		if(rootNode!=null) {
			postorder(rootNode.getLeft());
	        postorder(rootNode.getRight());
			System.out.print(rootNode.getValue() + " ");  // Visit node (root)

		}
	}
}