public class C5ithBit {

    public static int GetIthBit(int n, int i) {
        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int SetIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int ClearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int UpdateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return ClearIthBit(n, i);
        } else {
            return SetIthBit(n, i);
        }
    }

    public static int ClearBits(int n, int i) {
        int bitMask = (-1 << i); // (~0)<<i
        return n & bitMask;
    }

    public static int ClearRangeOfBits(int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(GetIthBit(10, 3));
        System.out.println(SetIthBit(10, 2));
        System.out.println(ClearIthBit(10, 1));
        System.out.println(UpdateIthBit(10, 1, 0));
        System.out.println(ClearBits(15, 2));
        System.out.println(ClearRangeOfBits(10, 2, 4));
        System.out.println(isPowerOfTwo(16));
    }
}
