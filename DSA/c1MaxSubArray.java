package DSA;

public class c1MaxSubArray {
    public static void printSubArrays(int numbers[]) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    sum = sum + numbers[k];
                }
                System.out.print("sum is: " + sum);
                if (maxSum < sum) {
                    maxSum = sum;
                }
                System.out.println();
            }

        }
        System.out.println("Max Sum is : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 5, 6, 7 };
        printSubArrays(numbers);
    }
}
