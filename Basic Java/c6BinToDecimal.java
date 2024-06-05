public class c6BinToDecimal {

    public static void binToDecimal(int biNum){
        int num = biNum;
        int pow = 0;
        int decNum = 0;

        while (biNum > 0) {
            int lastDigit = biNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            biNum = biNum/10;
        }
        System.out.println("Decimal of " + num + " = " + decNum);
    }
    public static void main(String[] args) {
       binToDecimal(101); 
    }
}
