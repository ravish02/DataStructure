package linkedlists;

public class App {

	public static void main(String[] args) {

		Node a = new Node();
		a.data = 1;

		Node b = new Node();
		b.data = 1;

		Node c = new Node();
		c.data = 1;

		Node d = new Node();
		d.data = 1;

		a.next = b;
		b.next = c;
		c.next = d;
		System.out.println(nodeLength(a));

		System.out.println(nodeLength(b));
	}

	public static int nodeLength(Node n) {
		int length = 0;

		Node current = n;
		while (current != null) {
			length++;
			current = current.next;
		}
		return length;
	}
}
