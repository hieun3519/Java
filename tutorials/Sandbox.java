package tutorials;
import java.util.*;
public class Sandbox {
    //    private static long[] fibonacciCache;
//    public static String findLongest(String s){
//        //String longestWord = Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null).toString();
//        String[] word = s.split(" ");
//        String longestWord = " ";
//        // int num=0;
//        for (String value : word) {
//            if (value.length() >= longestWord.length()) {
//                longestWord = value;
////                num = word[i].length();
////                System.out.println(num);
//            }
//        }
//
//        return longestWord;
//    }
//        public static long solution(String s){
//            long repeat = 0;
//
//
//            for(int i=0; i< s.length(); i++){
//                StringBuilder r = new StringBuilder();
//                for(int j=i; j < s.length(); j++){
//                    if(r.indexOf(String.valueOf(s.charAt(j))) != -1){
//                        break;
//                    }
//                    r.append(s.charAt(j));
//                    if(r.length() >= repeat){
//                        repeat = r.length();
//                    }
//                }
//            }
//            return repeat;
//        }
    public static class ABC {
        //Overridden method
        public void disp() {
            System.out.println("disp() method of parent class");
        }
    }

    public static class Demo extends ABC {
        //Overriding method
        public void disp() {
            System.out.println("disp() method of Child class");
        }

        public void newMethod() {
            System.out.println("new method of child class");
        }

        public static void main(String[] args) {
            ABC obj = new ABC();
            obj.disp();
            ABC obj2 = new Demo(); // Covariance with reference types
            obj2.disp();

//            String s = "nndNfdfdf";
//            System.out.println(solution(s));
//        String sentence = "How are you baby";
//        System.out.println(findLongest(sentence));

//        Scanner input =new Scanner(System.in);
//        int num = input.nextInt();
//        int num =5;
//        fibonacciCache = new long[num+1];
//        for(int i =0; i<= num ;i++){
//            System.out.print(fibonacci(i) + " ");
//        }

            // grows and shrinks automatically (dynamic sizing)
            // arrays can hold primitives or objects
            // arraylist can only hold objects
            // method call(arraylist) vs field call (array)
//        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("John",
//                "Eric", "Luke"));
//        // get element
//        System.out.println(friendsArrayList.get(1));
//        // get size
//        System.out.println(friendsArrayList.size());
//        // add an element
//        // array can't add an element to the end of the array
//        friendsArrayList.add("Mitch");
//        // set an element, or change
//        friendsArrayList.set(0, "Carl");
//        // remove an element
//        // can't remove element in an array because it has a fixed length
//        // can be an index or the value
//        friendsArrayList.remove("Chris");
//        // print
//        // arraylist implement toString method so printing list
//        // is clean unlike arrays
//        System.out.println(friendsArrayList);

//        int[] nums = {0, 1, 2, 5, 9, 11, 15, 20};
//        System.out.println(binarySearch(nums, 15));
        }
//    public static int binarySearch(int[] nums, int target){
//        int low =0;
//        int high = nums.length;
//
//        while(low <= high){
//            if(nums.length == 0){
//                return -1;
//            }
//            int middle = (low + high) /2;
//            if(target == nums[middle]){
//                return middle;
//            }
//            if (target < nums[middle]){
//                high = middle -1;
//            } else {
//                low = middle + 1;
//            }
//        }
//
//        return -1;
//    }
//    private static long fibonacci(int num) {
//        if(num <=1){
//            return num;
//        }
//        if(fibonacciCache[num] != 0){
//            return fibonacciCache[num];
//        }
//        long nthFibonacciNumber = (fibonacci(num -1) + fibonacci(num -2));
//        fibonacciCache[num] = nthFibonacciNumber;
//        return nthFibonacciNumber;
//    }
    }
}
