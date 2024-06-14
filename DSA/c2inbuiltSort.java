package DSA;

import java.util.*;

public class c2inbuiltSort {

    public static void printSortedArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        // Arrays.sort(arr); // sort in Ascending order
        // Arrays.sort(arr, 0, 4); // sort between given index
        // Arrays.sort(arr, Collections.reverseOrder()); // sort in descending order
        Arrays.sort(arr, 0, 4, Collections.reverseOrder()); // sort in descending order between given index
        printSortedArray(arr);
    }
}
