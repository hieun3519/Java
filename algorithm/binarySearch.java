import java.util.*;

public class binarySearch {
    // Half of the array and search upper or lower half
    // binary search= Search algorithm that finds the position
    // of the target in a SORTED array
    // half of the array each step
    // O(n^2)
    public static void main(String[] args){
        
        int array[] = {1, 3, 4, 5, 7, 9, 10, 12, 15};
        int target = 5;

        System.out.print(binaryS(array, target));

    }
    private static int binaryS (int[] array, int target){
        int low =0;
        int high = array.length -1;
        
        while(high >= low) {
            int mid = (low + high) /2;
            if(target < array[mid]){
                high = mid - 1;
            }
            else if(target == array[mid]){
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}