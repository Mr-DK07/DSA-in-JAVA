import java.util.Scanner;

public class d4pq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no. :");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        System.out.println("Factorial is :" + fact);
        sc.close();
    }
}
