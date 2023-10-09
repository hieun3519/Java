public class mergeSort {
    // split the array into half until you get a pair
    // sort it then merge them into one array
    public static void main(String[] args){
        int arr[] = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        mergeS(arr);

        for(int i: arr){
            System.out.print(i);
        }
    }
    private static void mergeS(int[] arr){
        int length = arr.length;
        // base case
        if(length <= 1){
            return;
        }
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i =0; // left array
        int j =0; // right array

        // copy from arr
        for(; i < length; i++){
            if(i < middle) {
                leftArray[i] = arr[i];
            }
            else {
                rightArray[j] = arr[i];
                j++;
            }
        }
        // recursive call
        mergeS(leftArray);
        mergeS(rightArray);
        merge(leftArray, rightArray, arr);
    }
    private static void merge(int[] leftArray, int[] rightArray, int[] arr){
        int leftSize = arr.length / 2;
        int rightSize = arr.length -leftSize;
        int i =0, l = 0, r =0; // indicies

        // check the conditions for merging
        while(l < leftSize && r < rightSize) {
            if(leftArray[l] < rightArray[r]){
                arr[i] = leftArray[l];
                i++;
                l++;
            } else {
                arr[i] = rightArray[r];
                i++;
                r++;
            }
        }
        // in case if they are the same
        while(l < leftSize) {
            arr[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize){
            arr[i] = rightArray[r];
            i++;
            r++;
        }

    }
}
