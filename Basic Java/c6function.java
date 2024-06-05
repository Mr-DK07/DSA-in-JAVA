public class c6function {

    public static void printHello() {
        System.out.println("Hello World!");
        return;
    }

    public static int calculateSum(int n1, int n2) { // parameters (n1, n2)
        int sum = n1 + n2;
        return sum;
    }

    public static void swapNumber() {
        int a = 5;
        int b = 10;

        // swapping
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
    }

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        printHello();

        int a = 15;
        int b = 5;

        // Sum
        int sum = calculateSum(a, b); // arguments (a, b)
        System.out.println("Sum is :" + sum);

        // swapping
        swapNumber();
        
        // Product
        int product = multiply(a, b);
        System.out.println("Product is :" + product);

        // factorial
        int fact = factorial(4);
        System.out.println("Factorial is : " + fact);

    }
}
