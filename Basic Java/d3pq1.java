import java.util.Scanner;

public class d3pq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no.:");
        int a = sc.nextInt();

        if(a>=0){
            System.out.println("It is positive.");
        }else{
            System.out.println("It is negative.");
        }
        sc.close();
    }
}
