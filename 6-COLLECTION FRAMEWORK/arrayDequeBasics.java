import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class arrayDequeBasics{
    public static void main(String[] args) {
        Deque<Integer> q= new ArrayDeque<Integer>();
        q.offer(10);
        q.offerFirst(20);
        q.offerLast(30);
        System.out.println(q);

        q.pollLast();
        //System.out.println(q);
        q.pollFirst();
        //System.out.println(q);

        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());
    }
}

    