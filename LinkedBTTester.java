package cmsc123Lab5;
public class LinkedBTTester {
    public static void main(String[] args) {
        // Create a new LinkedBT instance
        LinkedBT tree = new LinkedBT();

        // Create root node
        BTNode root = new BTNode("A");
        tree.setRoot(root);
        
        // Add left and right children to the root
        tree.setLeft(root, "B");
        tree.setRight(root, "C");
        
        // Add children to the left node (B)
        BTNode leftNode = root.getLeft();
        tree.setLeft(leftNode, "D");
        tree.setRight(leftNode, "E");
        
        // Add children to the right node (C)
        BTNode rightNode = root.getRight();
        tree.setLeft(rightNode, "F");
        tree.setRight(rightNode, "G");

        // Display the size of the tree
        System.out.println("Size of the tree: " + tree.getSize()); // Should print 7
        
        // Perform tree traversals
        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.getRoot());
        System.out.println();

        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.getRoot());
        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorder(tree.getRoot());
        System.out.println();
    }
}