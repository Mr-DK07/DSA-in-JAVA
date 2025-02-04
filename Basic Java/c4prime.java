import java.util.*;

public class c4prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your no. :");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("This is a prime no.");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("This is a prime no.");
            } else {
                System.out.println("This is not a prime no.");
            }
        }
        sc.close();
    }
}
