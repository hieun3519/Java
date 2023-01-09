import java.util.Queue;
import java.util.LinkedList;


public class QueuesTut{
    // Queue FIFO first in first out, imagine a actual queue
    // process in a linear data structure
    // add = enqueue, offer()
    // remove = dequeue, poll()
    // usage?
    // keyboard buffer
    // printer queue
    // LinkedLists, PriorityQueues, Breadth-first search
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        // System.out.println(queue.isEmpty());
        // System.out.println(queue.size());
        // System.out.println(queue.contains("Harold")); 
        // ^ doesn't tell the index

        //System.out.println(queue.peek());
        // queue.poll();
        // if you keep on polling until the queue is empty
        // then it shows the queue is empty and no exception
        // if you use queue.element() after the queue is 
        // empty then there is a exception

        System.out.println(queue);

    
    }
}