public class C7Fibonacci {

    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        
        int Fnm1 = fib(n-1);
        int Fnm2 = fib(n-2);
        int Fn = Fnm1 + Fnm2;

        return Fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
}
