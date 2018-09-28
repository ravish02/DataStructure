package singlylinkedlist;

public class SingleLinkedList {

	private Node first;
 
	public SingleLinkedList() {
	}

	public void insertFirst(int data) {
		 Node newNode = new Node();
	        newNode.data = data;
	        newNode.next = first;
	        first = newNode;

	}
	public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }
     
	public void insertLast(int data) {

		Node current = first;
        while(current.next != null){
            current = current.next; // we'll loop until current.next is null
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;

	}

	private boolean isEmpty() {
		return (first == null);
	}

  

	public void displayList() {
		while (first != null) {
			first.displayNode();
			first = first.next;
		}
	}

}
