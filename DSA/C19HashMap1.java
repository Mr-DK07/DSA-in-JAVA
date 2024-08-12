import java.util.*;

public class C19HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // insert O(1)
        hm.put("India", 100);
        hm.put("china", 150);
        hm.put("US", 90);
        hm.put("Nepal", 15);
        hm.put("Iran", 25);

        // Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("keys = " + k + ", value = " + hm.get(k));
        }
    }
}
