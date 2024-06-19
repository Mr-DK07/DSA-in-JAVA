package DSA;

public class C5OddEven {

    public static void OddEven(int n) {
        int bitMask = 1;

        if ((n & bitMask) == 0) {
            System.out.println("It is even.");
        } else {
            System.out.println("It is odd.");
        }
    }

    public static void main(String[] args) {

        OddEven(3);
        OddEven(0);
        OddEven(8);
    }
}
