import java.util.Scanner;

public class c3checkResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        if(marks>=33){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
