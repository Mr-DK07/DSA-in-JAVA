import java.util.Scanner;

public class c3taxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Amount: ");
        int Amount = sc.nextInt();

        if(Amount<=500000){
            System.out.println("Tax is 0% = " + (Amount*0));
        }else if(Amount > 500000 && Amount <= 1000000){
            System.out.println("Tax is 20% = " + (Amount*0.2));
        }else{
            System.out.println("Tax is 30% = " + (Amount*0.3));
        }
        sc.close();
    }
}
