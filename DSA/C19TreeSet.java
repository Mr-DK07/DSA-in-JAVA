import java.util.*;

public class C19TreeSet {
    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>();// implements using red-black trees, null not allowed, sorted.
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Mumbai");
        cities.add("Bengluru");
        cities.add("Varanasi");

        System.out.println(cities);
    }
}
