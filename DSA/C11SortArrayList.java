import java.util.*;

public class C11SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(3);

        // sort in ascending
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // sort in descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
