package queue;

public class View {

	public static void main(String[] args) {

		
		Queue   queue = new Queue(4);
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		
//		queue.view();
		
		System.out.println(queue.remove());
		queue.view();


	}

}
