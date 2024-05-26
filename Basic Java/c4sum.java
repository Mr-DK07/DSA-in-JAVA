import java.util.Scanner;

public class c4sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your no. :");
        int n = sc.nextInt();
        int sum = 0;
        
        int i = 1;

        while(i<=n){
            sum +=i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
