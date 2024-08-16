import java.util.*;

public class C19HashSetIteration {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Mumbai");
        cities.add("Bengluru");
        cities.add("Varanasi");

        // 1st method
        // Iterator i = cities.iterator();
        // while (i.hasNext()) {
        // System.out.println(i.next());

        // }

        // 2nd method
        for (String city : cities) {
            System.out.println(city);

        }
    }
}
