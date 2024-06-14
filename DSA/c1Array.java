package DSA;

import java.util.Scanner;

public class c1Array {
    public static void main(String[] args) {
        int marks[] = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        int avgMarks = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Average marks :" + avgMarks);
        sc.close();
        System.out.println(marks.length);
    }
}
