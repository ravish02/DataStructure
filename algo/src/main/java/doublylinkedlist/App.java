package doublylinkedlist;

public class App {
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		
		list.insertLast(11);
		list.insertLast(22);
		list.insertLast(33);

		
//		list.deleteFirst();
//		list.deleteLast();

		list.deleteKey(22);
		
		list.displayList();

	}

}
