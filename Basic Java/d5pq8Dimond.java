public class d5pq8Dimond {
    public static void main(String[] args) {
        int n = 5;

        // 1st half
        for(int i=1; i<=n; i++){
           for(int j=1; j<=(n-i); j++){
            System.out.print("  ");
           }
           for(int j=1; j<=(2*i)-1; j++){
            System.out.print("* ");
           }
           System.out.println(); 
        }

        // 2nd half
        for(int i=n; i>=1; i--){
            for(int j=2; j<=(n-i)+2; j++){
             System.out.print("  ");
            }
            for(int j=2; j<(2*i)-1; j++){
             System.out.print("* ");
            }
            System.out.println(); 
         }
    }
}
