import java.util.*;

public class Main {
    public static void main(String[] args) {
//        genericC<Integer> printer = new genericC<>(23);
//        printer.print();

        System.out.println("Hello world!");
//        shout("John", 57);
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);


//        ArrayList<Object> cats = new ArrayList<>();
//        cats.add(new Cat());
    }
    /* if we want to return something we can use a generic
       and return it with whatever
     */

//    private static <T, V> T shout (T thingToShout, V otherthingToShout) {
//        System.out.println(thingToShout + "!!!!!");
//        System.out.println(otherthingToShout + "!!!!!");
//
//        return thingToShout;
//    }

    /* wildcard = ?
       when you don't know what the generic type will be
       can also be bounded so ? extends class
     */
    private static void printList(List<?> myList){
        System.out.println();
    }
}