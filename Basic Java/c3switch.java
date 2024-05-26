import java.util.Scanner;

public class c3switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no. : ");
        int a = sc.nextInt();

        System.out.println("Enter Operator : ");
        char ch = sc.next().charAt(0);

        System.out.println("Enter second no. : ");
        int b = sc.nextInt();

        switch (ch) {
            case '+': 
            System.out.println("Ans = " + (a+b));               
                break;

            case '-':
            System.out.println("Ans = " + (a-b));
                break;

            case '*':
            System.out.println("Ans = " + (a*b));
                break;
            
            case '/':
            System.out.println("Ans = " + (a/b));
                break;
            
            case '%':
            System.out.println("Ans = " + (a%b));
                break;
            default: System.out.println("Invalid Operator.");
                break;
        }
        sc.close();
    }
}
