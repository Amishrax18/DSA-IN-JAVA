import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueueBasics {
    public static void main(String[] args) {
        Queue<Integer> pq= new  PriorityQueue<>();
        //default-> Integers ->less value-> high priority ->minHeap 
        pq.offer(40);
        pq.offer(20);
        pq.offer(10);
        pq.offer(30);

        System.out.println(pq);
        System.out.println((pq.poll()));
        System.out.println(pq);
        System.out.println((pq.poll()));
        System.out.println(pq);
        System.out.println((pq.poll()));
        
    }
}
