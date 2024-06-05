import java.util.Scanner;

public class d4pq1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.println("Enter your no. :");
            num = sc.nextInt();

            if(num % 2 == 0){
                evenSum += num;
            }else{
                oddSum += num;
            }
            System.out.println("Do you want to continue? Press 1 for yes or 0 for no.");

            choice = sc.nextInt();
        }while(choice == 1);

        System.out.println("Sum of even number is :" + evenSum);
        System.out.println("Sum of odd number is :" + oddSum); 

        sc.close();
    }
}