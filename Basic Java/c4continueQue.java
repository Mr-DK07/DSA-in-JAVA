import java.util.Scanner;

public class c4continueQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{ 
            System.out.print("Enter no. :");
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue;
            }
            System.out.println(n);
            sc.close();
        }while(true);
    }
}
 