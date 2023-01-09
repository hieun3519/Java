import java.util.*;

public class LinkedlistTut {
    // made up of long chain of nodes
    // have easier time insert and delete than array list
    // data, address
    // Locate an element is O(n) since you are traversing
    // insertion/deletion O(1)
    // singly & doubly LinkedLists
    // singly - point from tails to head 
    // doubly- heads to tails or tails to heads but uses more
    // memory
    //
    // advantage?
    // dynamic data structure
    // O(1) for insert and delete
    // No/Low memory waste
    //
    // disadvantages?
    // greater memory usage (additional pointer)
    // no random access of element (no index [i])
    // access/search elements is O(n)
    //
    // uses?
    // implement stack or queue
    // GPS navigation
    // music playlists
    
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();

        // D C B A
        // linkedList.push("A");
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.push("F");
        // linkedList.pop();

        // B C D F
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        //linkedList.poll();

        linkedList.add(4, "E");
        linkedList.remove("E");
        // System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addFirst("G");

        // String first = linkedList.removeFirst();
        // String last = linkedList.removeLast();

        // System.out.println(last);
        // System.out.println(first);
        System.out.println(linkedList);
    }
}
