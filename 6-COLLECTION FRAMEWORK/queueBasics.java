import java.util.LinkedList;
import java.util.Queue;

public class queueBasics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        //add.  //offer-> we prefeer offe in place of add 
        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println(q);

        System.out.println("Removing"+q.poll());
        System.out.println(q);

        System.out.println("peeking "+q.peek());
       
        }
    }
    

