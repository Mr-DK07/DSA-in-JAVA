public class C8Tiling {

    public static int waysOfTiling(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        // verticle choice
        int fnm1 = waysOfTiling(n-1);

        // horizontal choice
        int fnm2 = waysOfTiling(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        int n = 4;

        System.out.println(waysOfTiling(n));
    }
}
