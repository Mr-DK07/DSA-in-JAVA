import java.util.Scanner;

public class d1pq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float cost = pen+pencil+eraser; 
        float bill = cost+((cost*18)/100);
        System.out.println("Total bill is : " + bill);
        sc.close();
        
    }
}
