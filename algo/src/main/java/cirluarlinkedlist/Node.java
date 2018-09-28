package cirluarlinkedlist;

public class Node {

	public int data;
	public Node next;
	
	public void displayNode() {
		System.out.println("{ "+ data +" }");
	}
	
	public void displayNode1() {
		System.out.println("{ --> "+ data +" <---}");
	}
}
