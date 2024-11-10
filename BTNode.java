package cmsc123Lab5;

public class BTNode {
    // BTNode attributes: value, parentNode, leftNode, rightNode
    String value;
    BTNode parentNode, leftNode, rightNode;

    public BTNode(String value) {
        // REQUIRED 
        this.value = value;
        this.leftNode = null;
        this.parentNode = null;
        this.rightNode = null;
    }

    public void setValue(String value) {
        // REQUIRED
        this.value = value;
    }

    public String getValue() {
        // REQUIRED
        return this.value;
    }

    public void setParent(BTNode parentNode) {
        // REQUIRED
        this.parentNode = parentNode;
    }

    public BTNode getParent() {
        // REQUIRED
        return this.parentNode;
    }

    public void setLeft(BTNode leftNode) {
        // REQUIRED
        this.leftNode = leftNode;
    }

    public BTNode getLeft() {
        // REQUIRED
        return this.leftNode;
    }

    public void setRight(BTNode rightNode) {
        // REQUIRED
        this.rightNode = rightNode;
    }

    public BTNode getRight() {
        // REQUIRED
        return this.rightNode;
    }
}