import java.util.*;

public class C19TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();// ds used in treemap is : Red-Black Trees
        tm.put("Delhi", 120);
        tm.put("Lucknow", 90);
        tm.put("Nepal", 10);

        System.out.println(tm);// sorted output is print (Based on key)
    }
}
