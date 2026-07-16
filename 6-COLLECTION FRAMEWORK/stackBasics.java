import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

import javax.management.openmbean.ArrayType;

public class stackBasics {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        stack.push(10);
        stack.push(120);
        stack.push(30);
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}

