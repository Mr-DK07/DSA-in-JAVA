import java.util.Scanner;

public class d4pq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your no. to print table : ");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            int table = num*i;
            System.out.println(table);
        }
        sc.close();
    }
}
