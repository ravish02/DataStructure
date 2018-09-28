package lenearsearch;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] arr = "ravish".toCharArray();
		System.out.println(searchX(arr,'v'));
	}

	public static int searchX(char[] arr,char x) {
		
		for (int i = 0; i < arr.length; i++) {
			char y= arr[i];
			if(y==x) {
				return i;
			}
			
		}
		return -1;
	}
}
