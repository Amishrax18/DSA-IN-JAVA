import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class JCF {
    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
        //add
        arr.add(10);
        arr.add(8);
        arr.add(0);
        arr.add(3);
        System.out.println(arr);
        arr.add(5);
        System.out.println(arr);
        
        //remove
        arr.remove(4);
        System.out.println(arr);

        //addAll
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(2);
        arr.addAll(list);
        System.out.println(arr);
        
        //removeAll
        arr.removeAll(list);
        System.out.println(arr);

        //size
        System.out.println(arr.size());

        //clear
        //arr.clear();
        //System.out.println(arr.size());

        //I want to travel list using Iterator
        Iterator<Integer> iterator = arr.iterator();
        while(iterator.hasNext()){
            System.out.println("Element "+ iterator.next());
        }

        //get
        System.out.println(arr.get(0));
        arr.set(0,100);
        System.out.println(arr);

        //toArray
        Object[] array=arr.toArray();
        for(Object obj : array)
        System.out.println(obj);
        
        //contains->return true or false
        System.out.println(arr.contains(1123));

        //sort
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);

        //clone
        ArrayList<Integer> newList=(ArrayList<Integer>)(arr.clone());
        System.out.println((newList));

        //ensure capacity
        ArrayList<Integer> marks= new ArrayList<>();
        marks.ensureCapacity(100);

        //isEmpty
        System.out.println(marks.isEmpty());

        //INDEXoF
        System.out.println(arr.indexOf(3));

        //lastindexof
         System.out.println(arr.lastIndexOf(100));

         //addFirst and addlast
         System.out.println(arr);
         arr.addFirst(101);
         System.out.println(arr);

         LinkedList<Integer> ll= new LinkedList<>();
         ll.add(1);
         System.out.println(ll);
         ll.addFirst(101);
         System.out.println(ll);
         ll.addLast(223);
         System.out.println(ll);

        
        System.out.println(ll.getFirst());
        
        System.out.println(ll.getLast());

        //ll.removeFirst();
        //ll.removeLast();
        System.out.println(ll);
        arr.removeFirst();
        //System.out.println(arr);

        //peek&poll&offer
        System.out.println(ll.peek());
        System.out.println(ll.poll());
        System.out.println(ll);
        ll.offer(12);
        System.out.println(ll);
        arr.addFirst(12);
        System.out.println(arr);

        Stack<Integer> stacks= new Stack<>();
        stacks.push(10);
        System.out.println(stacks);
        stacks.push(11);
        stacks.push(12);
        System.out.println(stacks);
        stacks.pop();
        System.out.println(stacks);
        System.out.println(stacks.peek());
        System.out.println(stacks.search(11));
        System.out.println(stacks.empty());

    }
}
