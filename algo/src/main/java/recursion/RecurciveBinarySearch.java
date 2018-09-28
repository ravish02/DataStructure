package recursion;

public class RecurciveBinarySearch {

	public static int[] arr = { 1 ,44,55,77,88,99,102,304,506};
	public static int x = 1;

	static int startI;

	static int midI;

	static int endI;

	public static void main(String[] args) {

		startI = 0;
		midI = (arr.length - 1) / 2;
		endI = arr.length - 1;

		searcX(midI);

	}

	public static void searcX(int mid) {

		if (mid == 0 && arr[mid] != x) {
			System.out.println("Not found ");

		}

		else if (arr[mid] == x) {

			System.out.println("found " + x + " at " + mid);

		} else if (arr[mid] >= x) {

			endI = mid - 1;

			mid = endI / 2;
			System.out.println("mid " + mid);
			searcX(mid);

		} else if (arr[mid] <= x) {

			startI = mid + 1;

			mid = (startI + arr.length - 1) / 2;
			System.out.println("mid " + mid);

			searcX(mid);

		} else {
			System.out.println("Not found ");

		}

	}
}
