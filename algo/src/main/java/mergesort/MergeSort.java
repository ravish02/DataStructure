package mergesort;

public class MergeSort {


    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] inputarr, int start, int end) {
        if (end <= start)
            return;

        int mid = (start + end) / 2;

        sort(inputarr, 0, mid);//left
        sort(inputarr, mid + 1, end);//left
        finalMerge(inputarr, start, mid, end);//left
    }

    private static void finalMerge(int[] inputArray, int start, int mid, int end) {

        int tempArray[] = new int [end - start +1 ];

        // index counter for the left side of the array
        int leftSlot = start;
        // index counter for the right side of the array
        int rightSlot = mid+1;
        int k = 0;

        while(leftSlot <= mid && rightSlot <= end){
            if(inputArray[leftSlot] < inputArray[rightSlot]){
                tempArray[k] = inputArray[leftSlot];
                leftSlot = leftSlot + 1;
            } else{
                tempArray[k] = inputArray[rightSlot];
                rightSlot = rightSlot + 1;
            }
            k = k+1;
        }

        /**
         * When it get's to here, that means the above loop has completed.
         * So both the right and the left side of the sub-array can be considered sorted
         */

        if(leftSlot <= mid){ // consider the right side done being sorted. Left must be sorted already
            while(leftSlot <= mid){
                tempArray[k] = inputArray[leftSlot];
                leftSlot = leftSlot + 1;
                k = k+1;
            }
        } else if ( rightSlot <= end){
            while(rightSlot <= end){
                tempArray[k] = inputArray[rightSlot];
                rightSlot = rightSlot+1;
                k = k+1;
            }
        }

        // copy over the tmep array into the appropriate slots of the inputArray
        for(int i = 0; i < tempArray.length; i++){
            inputArray[start+i] = tempArray[i];
        }
    }


}
