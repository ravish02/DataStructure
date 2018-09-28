package binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		// TODO Auto-generated method stub
		System.out.println(binarySearch(arr, 88));
	}

	public static int binarySearch(int[] arr, int x) {
		int index = -1;

		int first = 0;

		int middle;

		int last = arr.length - 1;

		while (first <= last) {
			middle = (first + last) / 2;

			if (arr[middle] == x) {
				return middle;
			} else if (arr[middle] > x) {
				last = middle - 1;
			} else if (arr[middle] < x) {
				first = middle + 1;

			} else {
				return index;

			}
		}

		return index;

	}
}
