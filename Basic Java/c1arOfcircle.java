import java.util.Scanner;

public class C1arOfcircle {
    public static void main(String[] args) {
        System.out.println("Enter radius:");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        float area = (float) 3.14*radius*radius;
        System.out.println(area);
        sc.close();
    }
}
