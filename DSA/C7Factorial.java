public class C7Factorial {

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fc = n * fnm1;

        return fc;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fact(n));
    }
}
