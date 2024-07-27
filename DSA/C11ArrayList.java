import java.util.*;

public class C11ArrayList {
   public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add operation O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1, 9); //add on index O(n)

        System.out.println(list);
        
        // size
        System.out.println(list.size());

        // print the ArrayList O(n)
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // print reverse of ArrayList O(n)
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // get operation O(1)
        int element = list.get(2);
        System.out.println(element);

        // delete O(n)
        list.remove(2);
        System.out.println(list);

        // set element at index O(n)
        list.set(2, 10);
        System.out.println(list);

        // contains element O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
        
   } 
}
