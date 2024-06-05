public class c6decToBin {

    public static void DecimalToBinary(int decNum){
        int myNum = decNum;
        int pow = 0;
        int biNum = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            biNum = biNum + (rem * (int)Math.pow(10, pow));

            pow++;
            decNum = decNum/2;
        }
        System.out.println("Binary form of " + myNum + " is :" + biNum);
    }
    public static void main(String[] args) {
        DecimalToBinary(15);
    }
}
