package binarysearchtree;

public class BST {

    private Node root;

    public void insertNode(int key, String value) {

        Node newNode = new Node(key, value);

        if (root == null) {
            root = newNode;
        } else {

            Node current = root;
            Node parent;

            while (true) {
                parent = current;
                if (key < current.key) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }

            }

        }

    }

    public Node findMin() {
        Node current = root;
        Node last = null;
        while (current != null) {


            last = current;
            current = current.leftChild;

        }
        return last;

    }

    public Node findMax() {
        Node current = root;
        Node last = null;
        while (current != null) {

            last = current;
            current = current.rightChild;


        }
        return last;

    }

    public boolean removeNode(int key) {

        Node currentNode = root;
        Node parentNode = root;

        boolean isLeftChild = false;

        //Search to find node in a tree

        while (currentNode.key != key) {
            parentNode = currentNode;
            if (key < currentNode.key) {
                currentNode = currentNode.leftChild;
                isLeftChild = true;
            } else {
                currentNode = currentNode.rightChild;
                isLeftChild = false;
            }
            if (currentNode == null)
                return false;

        }
        // this will be node to delete
        Node nodeToDelete = currentNode;

        //if node is a leaf
        if (nodeToDelete.leftChild == null && nodeToDelete.rightChild == null) {
            if (nodeToDelete == null) {
                root = null;
            } else if (isLeftChild) {
                parentNode.leftChild = null;
            } else {
                parentNode.rightChild = null;
            }
        }
        
        //if node has one child
        else if (nodeToDelete.rightChild != null) {
             if (isLeftChild)
                parentNode.leftChild = currentNode.rightChild;
            else
                parentNode.rightChild = currentNode.rightChild;
        } else if (nodeToDelete.leftChild != null) {
            if (isLeftChild)
                parentNode.leftChild = currentNode.leftChild;
            else
                parentNode.rightChild = currentNode.leftChild;
        }

        //if node has 2 child

        return true;
    }

}
