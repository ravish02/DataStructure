package selectionsort;

public class App {

	public static void main(String[] aa) {

		int[] arr = { 99,5, 1, 22, 3, 445, 6, 32, 56, 44 };
		System.out.println(sortArray(arr));
	}

	public static int[] sortArray(int[] arr) {

		int newMinI = 0;

		int minVal = arr[0];
		int temp = 0;

		for (int j = 0; j < arr.length; j++) {
			minVal = arr[j];
			for (int i = j; i < arr.length; i++) {
				if (arr[i] < minVal) {
					minVal = arr[i];
					newMinI = i;
				}
			}
			temp = arr[j];

			arr[j] = arr[newMinI];

			arr[newMinI] = temp;

		}
		return arr;

	}

}
