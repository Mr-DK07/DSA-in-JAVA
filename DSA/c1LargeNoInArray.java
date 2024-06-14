package DSA;

//import java.util.*;
//Smallest and Largest in Array
public class c1LargeNoInArray {

    public static int getSmallest(int numbers[]) {
        int Smallest = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < numbers.length; i++) {
            if (Smallest > numbers[i]) {
                Smallest = numbers[i];
            }
        }
        return Smallest;
    }

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 5, 6, 9, 7, 10, 20 };
        System.out.println("Smallest no. is : " + getSmallest(numbers));
        System.out.println("Largest no. is : " + getLargest(numbers));

    }
}
