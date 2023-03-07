package dynamicarray;

public class DynamicArrayTut {
    // access element in O(1)
    // searching for a stored value is O(n), linear time
    // same with insert and delete
    // 
    // advantages?
    // random access of elements O(1)
    // good locality of reference and data cache utilization, mem next to each other
    // easy to insert/delete since no shifting require
    //
    // disadvantages?
    // waste more memory than linked list
    // shifting elements is time consuming O(n)
    // expanding/shrinking is time consuming O(n)

    public static void main(String[] args){
        // ArrayList<Integer> arryA = new ArrayList<Integer>();

        DynamicArray dynamicArray = new DynamicArray(5);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        
        // dynamicArray.insert(0, "X");
        // dynamicArray.delete("A");
        // System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("size " + dynamicArray.size);
        System.out.println("capacity " + dynamicArray.capacity);
        System.out.println("empty " + dynamicArray.isEmpty());
    }
}
