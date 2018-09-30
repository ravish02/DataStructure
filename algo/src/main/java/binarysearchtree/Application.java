package binarysearchtree;

public class Application {

    public static void main(String[] arg)
    {

        BST bst = new BST();
        bst.insertNode(2,"2");
        bst.insertNode(12,"12");
        bst.insertNode(1,"1");
        bst.insertNode(332,"332");
        System.out.println(bst.findMin().key);
        System.out.println(bst.findMax().key);
    }
}
