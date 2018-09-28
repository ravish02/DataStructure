package doublylinkedlist;

public class DoublyLinkedList {

	private Node first;
	private Node last;

	public DoublyLinkedList() {
	}

	public void insertFirst(int data) {
		Node latestNode = new Node();
		latestNode.data = data;

		if (isEmpty()) {
			last = latestNode;
		} else {
			first.previous = latestNode;
		}

		latestNode.next = first;

		first = latestNode;

	}

	public void insertLast(int data) {
		Node latestNode = new Node();
		latestNode.data = data;

		if (isEmpty()) {
			first = latestNode;
		} else {
			last.next = latestNode;

			latestNode.previous = last;

		}
		last = latestNode;

	}

	public Node deleteFirst() {

		first.next.previous = null;
		first = first.next;

		return first;

	}

	public Node deleteLast() {

		last.previous.next = null;
		last = last.previous;

		return last;

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

	public boolean insertAfter(int key, int data) {
		Node current = first;

		while (current.data != key) {
			current = current.next;
			if (current == null)
				return false;
		}
		Node newNode = new Node();
		newNode.data = data;
		
		
		newNode.next = current.next;
		current.next.previous= newNode;

		newNode.previous = current;
		
		
		current.next = newNode;
		
		
		
		
		return true;
	}

	public boolean deleteKey(int key)
	{
		Node current = first;
		while (current.data != key) {
			current = current.next;
			
		}
		
		current.previous.next = current.next;
				
		current.next.previous = current.previous;
		
		
		return true;

	}
	
}
