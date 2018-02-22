package com.java.hackerrank;

class NodeTree {

    int value;
    NodeTree left, right;

    public NodeTree(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BinarySearchTree {

    NodeTree root;

    public boolean isBST() {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTUtil(NodeTree node, int minValue, int maxValue) {

        if(node == null) {
            return true;
        }

        if(node.value < minValue || node.value > maxValue) {
            return false;
        }

        return (isBSTUtil(node.left, minValue, node.value)
                && isBSTUtil(node.right, node.value, maxValue));
    }

    public static void main(String args[])
    {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new NodeTree(4);
        tree.root.left = new NodeTree(7);
        tree.root.right = new NodeTree(5);
        tree.root.left.left = new NodeTree(1);
        tree.root.left.right = new NodeTree(3);

        if (tree.isBST())
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }

}
