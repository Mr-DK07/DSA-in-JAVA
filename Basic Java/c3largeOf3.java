import java.util.Scanner;

public class c3largeOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd no: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("1st no. is greater.");
        }else if(b>c){
            System.out.println("2nd no. is greater.");
        }else{
            System.out.println("3rd no. is greater.");
        }
        sc.close();
    }
}
