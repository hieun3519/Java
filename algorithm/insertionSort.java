public class insertionSort {
    // compare elements to the left
    // shift elements to the right to make room to insert a 
    // value
    // O(N^2)
    public static void main(String[] args){
        int arr[] = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        insertionS(arr);

        for(int i: arr){
            System.out.print(i);
        }
    }
    private static void insertionS(int arr[]){

        for(int i=1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            // swapping
            arr[j + 1] = temp;
        }
        
    }
}
