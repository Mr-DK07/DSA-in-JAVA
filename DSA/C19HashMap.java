import java.util.*;
public class C19HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // insert O(1)
        hm.put("Pizza", 250);
        hm.put("Tea", 10);
        hm.put("Burger", 50);
        hm.put("Chhola-Bhatura", 150);

        System.out.println(hm);

        // Get O(1)
        int Price = hm.get("Tea");
        System.out.println(Price);

        System.out.println(hm.get("Water")); // null

        // ContainsKey - O(1)

        System.out.println(hm.containsKey("Pizza"));// true
        System.out.println(hm.containsKey("Momos"));// false

        // Remove O(1)
        System.out.println(hm.remove("Chhola-Bhatura"));
        System.out.println(hm);

        // Size O(1)
        System.out.println(hm.size());
        
        // is Empty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm);
    }
}
