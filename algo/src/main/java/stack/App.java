package stack;

public class App {

	public static void main(String[] args) {
//		Stack myStack = new Stack(5);
//		myStack.push(11);
//		myStack.push(12);
//		myStack.push(13);
//		myStack.push(14);
//		myStack.push(15);
//		myStack.push(16);
//
//		while (!myStack.isEmpty()) {
//			long value = myStack.pop();
//			System.out.println(value);
//		}

		System.out.println(reverseString("hello"));
	}

	public static String reverseString(String inStr) {
		Stack myStack = new Stack(inStr.length());

		String reverseStr = "";
		for (int i = 0; i < inStr.length(); i++) {
			char c = inStr.charAt(i);
			myStack.push(c);
 			
		}
		while(!myStack.isEmpty()) {
			char ch = myStack.pop();
		reverseStr  = reverseStr + ch;
		}
		return reverseStr;
	}

}
