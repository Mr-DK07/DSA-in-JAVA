import java.util.*;
public class C19LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();// lhm print output in same sequence
        lhm.put("India", 100);
        lhm.put("China", 90);
        lhm.put("Nepal", 10);

        System.out.println(lhm);
    }
}
