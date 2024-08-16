import java.util.*;

public class C19MajorityElements {
    public static void main(String[] args) { // O(n)
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        HashMap<Integer, Integer> hm = new HashMap<>();
        int freq = arr.length / 3;

        for (int i = 0; i < arr.length; i++) {
            // if (hm.containsKey(arr[i])) {
            // hm.put(arr[i], hm.get(arr[i]) + 1);
            // } else {
            // hm.put(arr[i], 1);
            // }

            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        for (Integer key : hm.keySet()) {
            if (hm.get(key) > freq) {
                System.out.println(key);
            }
        }
    }
}
