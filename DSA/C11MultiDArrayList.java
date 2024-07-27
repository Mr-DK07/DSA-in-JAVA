import java.util.ArrayList;

public class C11MultiDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);
        mainlist.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainlist.add(list2);

        for(int i=0; i<mainlist.size(); i++){
            ArrayList<Integer> currList = mainlist.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println(mainlist);
// -----------------------------------------------------//
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            l1.add(i*1);
            l2.add(i*2);
            l3.add(i*3);
        }
        lists.add(l1);
        lists.add(l2);
        lists.add(l3);

        System.out.println(lists);

        // print by nested loop
        for(int i=0; i<lists.size(); i++){
            ArrayList<Integer> currL = lists.get(i);
            for(int j=0; j<currL.size(); j++){
                System.out.print(currL.get(j)+ " ");
            }
            System.out.println();
        }

    }
}
