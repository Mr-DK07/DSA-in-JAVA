public class C7SumOfNums {

    public static int calcSum(int n){
        if(n == 1){
            return 1;
        }
        int Snm1 = calcSum(n-1);
        int sm = n + Snm1;

        return sm;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calcSum(n));
    }
}
