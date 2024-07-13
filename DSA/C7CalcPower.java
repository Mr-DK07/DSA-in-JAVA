public class C7CalcPower {

    // calculate x to the power n brute force : TC = O(n)
    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int Xnm1 = calcPower(x, n - 1);
        int cp = x * Xnm1;

        return cp;
    }

    // calculate x to the power n optimized  : TC O(log n)
    public static int optPower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPower = optPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(optPower(x, n));
    }
}
