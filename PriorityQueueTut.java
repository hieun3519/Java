import java.util.*;

public class PriorityQueueTut {
    // similar to queue but certain element are serve first
    // depending on how high their priorities is
    public static void main(String[] args){
        // Queue<Double> queue = new LinkedList<>();
        Queue<String> queue = new PriorityQueue<>();
        // Collections.reverseOrder() - reverse the order 
        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
