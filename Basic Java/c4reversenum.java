import java.util.Scanner;

public class c4reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no. :");
        int n = sc.nextInt();
        int rev = 0;

        while (n > 0) {
            int lastDigit = n%10;
            // System.out.print(lastDigit + " ");
            rev = (rev*10)+lastDigit;
            n /=10;
        }
        System.out.println(rev);
        sc.close();

    }
}
