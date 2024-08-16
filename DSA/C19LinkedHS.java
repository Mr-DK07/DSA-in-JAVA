import java.util.*;

public class C19LinkedHS {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>(); // it is in order
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Mumbai");
        cities.add("Bengluru");
        cities.add("Varanasi");

        System.out.println(cities);

    }  
}
