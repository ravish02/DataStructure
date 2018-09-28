package recursion;

public class RecurciveLinearSearch {

	public static int[] arr = { 1, 2, 32, 23, 5, 11, 0, 45 };
	public static int x = 333;

	public static void main(String[] args) {

		searcX(arr.length - 1);
	}

	public static void searcX(int i) {

		if (arr[i] != x) {
			if (i > 0)
				searcX(i - 1);
			else
				System.out.println("NOT found " );
		} else {
			System.out.println("found " + x + " at " + i);
		}
	}
}
