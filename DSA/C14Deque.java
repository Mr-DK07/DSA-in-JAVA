import java.util.*;

public class C14Deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        dq.addFirst(2);
        dq.addFirst(1);
        dq.addLast(3);
        dq.addLast(4);

        System.out.println(dq);

        dq.removeLast();
        System.out.println(dq);

        System.out.println("First el = "+dq.getFirst());
        System.out.println("Last el = "+dq.getLast());
    }
    
}
