import java.util.*;

public class C19HashSet {// used to store unique value and implement using HashMap
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(3);
        set.add(1);

        set.remove(3);

        System.out.println(set);
        set.clear();

        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}
