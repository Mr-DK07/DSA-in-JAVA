import java.util.Scanner;

public class d3pq5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year :");
        int yr = sc.nextInt();

        if(yr % 4 == 0){
            if(yr % 100 == 0){
                if(yr % 400 == 0){
                    System.out.println("This is a leap year.");
                }
                else{
                    System.out.println("This is not a leap year");
                }
            }else{
                System.out.println("This is a leap year.");
            }
        }else{
            System.out.println("This is not a leap year.");
        }
        sc.close();
    }
}
