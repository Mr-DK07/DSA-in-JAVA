import java.util.Scanner;

public class c3OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your no: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("It is a even no.");
        }else{
            System.out.println("It is a odd no.");
        }
        sc.close();
    }
}
