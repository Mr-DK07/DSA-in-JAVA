import java.util.ArrayList;

public class C11PairSum2 {

    public static boolean pairSum2(ArrayList<Integer> list, int target) { // TC O(n)

        int n = list.size();
        int pivot = -1;

        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }
        int lp = pivot + 1;
        int rp = pivot;

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int target = 5;
        System.out.println(pairSum2(list, target));
    }
}
