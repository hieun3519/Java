public class bubbleSort {
    // O(n^2)
    // swap between i and i + 1 if i > i + 1
    public static void main(String[] args){
        int arr[] = {9, 1, 8, 2, 7, 3, 6, 5};

        bubbleS(arr);

        for(int i: arr){
            System.out.print(i);
        }
    }
    private static void bubbleS(int arr[]){

        for(int i=0; i< arr.length; i++){
            for(int j=0; j < arr.length - i -1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
