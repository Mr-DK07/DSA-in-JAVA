public class d6pq4 {

    public static int sumOfDigits(int n){
        int num = n;
        int sum = 0;
        while (num > 0) {
            int lastDigit = num%10;
            sum += lastDigit;
            num /=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
    }
}
