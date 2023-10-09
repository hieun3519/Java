public class quickSort {
    // divide and conquer
    // moves smaller elements to the left of a pivot
    // recursively divide array in 2 partitions
    // best and worse case O(nlog(n))
    // time complexity O(log(n))
    public static void main(String[] args){
        int arr[] = {9, 1, 8, 2, 7, 3, 6, 5};

        // array, begining, and the end of the array
        quickS(arr, 0, arr.length - 1);

        for(int i: arr){
            System.out.print(i);
        }
    }
    private static void quickS(int[] arr, int start, int end){
        if(end <= start) return; // base case
        // find our pivot
        int pivot = partition(arr, start, end);
        quickS(arr, start, pivot -1);
        quickS(arr, pivot + 1, end);

    }
    private static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        // start before the array
        int i = start - 1;

        // swap if j is less than pivot
        for(int j = start; j <= end - 1; j++){
            if(arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        // location of pivot
        return i;
    }
}
