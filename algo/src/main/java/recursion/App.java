package recursion;

public class App {
	public static void main(String[] arg) {

		reduceByOne(10);
	}

	private static void reduceByOne(int i) {
		
		if(i>=0)
			reduceByOne(i-1);
		
		System.out.println("completed : "+i);
		
	}
}
