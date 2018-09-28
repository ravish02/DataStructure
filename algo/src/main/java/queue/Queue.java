package queue;

public class Queue {

	private int maxSize; // initializes the set number of slots
	private long[] queArray; // slots to main the data
	private int front; // this will be the index position for the element in the front
	private int rear; // going to be the index position for the element at the back of the line
	private int nItems; // counter to maintain the number of items in our queue

	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[maxSize];

		front = 0;
		rear = -1;

		nItems = 0;
	}

	public void insert(long j) {
		rear++;
		queArray[rear] = j;
		nItems++;
	}

	public long remove() {
		long temp = queArray[front];
		front++;
		nItems--;
		
		return temp;

	}

 
	public void view(){
        System.out.print("[ ");
        for(int i = 0; i < queArray.length; i++){
            System.out.print(queArray[i]+ " ");
        }
        System.out.print("]");
    }
}
