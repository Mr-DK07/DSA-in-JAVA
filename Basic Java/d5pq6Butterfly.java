public class d5pq6Butterfly {
    public static void main(String[] args) {
        int n = 3;
        // 1st half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {               
                System.out.print("* ");               
            }
            for(int j = 1; j<=2*(n-i); j++ ){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {               
                System.out.print("* ");               
            }
            for(int j = 1; j<=2*(n-i); j++ ){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
