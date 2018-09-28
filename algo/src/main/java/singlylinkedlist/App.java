package singlylinkedlist;

public class App {
	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		
		list.insertLast(11);
		list.insertLast(22);
		list.insertLast(33);
		list.insertFirst(99);

		list.displayList();
	}

}
