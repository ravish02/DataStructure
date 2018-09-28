package insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 99, 5, 1, 22, 3, 445, 6, 32, 56, 44 ,8};
		System.out.println(sortArray(arr));
	}

	public static int[] sortArray(int[] arr) {
 
		int minVal = arr[0];
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {

			minVal = arr[i];

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] < minVal) {
					temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;
					
					
				}
//				System.out.println(arr);

			}
			System.out.println(arr);

		}

		return arr;

	}

}
