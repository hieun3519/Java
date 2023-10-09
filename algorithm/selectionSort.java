public class selectionSort {
    // O(n^2)
    // SELECT min value
    // store min value and swap it with the front
    public static void main(String[] args){
        int arr[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        selectionS(arr);
        for(int i: arr){
            System.out.print(i);
        }
    }
    private static void selectionS(int[] arr){
        for(int i=0; i< arr.length -1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
