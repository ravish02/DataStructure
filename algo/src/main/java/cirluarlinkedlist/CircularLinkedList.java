package cirluarlinkedlist;

public class CircularLinkedList {

	private Node first;
	private Node last;

	public CircularLinkedList() {
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		if (isEmpty()) {
			last = newNode;
		}
		first = newNode;

	}

	public void insertLast(int data) {

		Node latestNode = new Node();
		latestNode.data = data;

		if (isEmpty()) {
			first = latestNode;
			last = latestNode;
		} else {
			last.next = latestNode;
			last = latestNode;
		}

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
