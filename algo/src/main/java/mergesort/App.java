package mergesort;

public class App {


    public static void main(String[] arr) {


        int[] inputArray = {9, 7, 1, 2, 3, 0};
        MergeSort sorter = new MergeSort();

        sorter.sort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
    }
}
