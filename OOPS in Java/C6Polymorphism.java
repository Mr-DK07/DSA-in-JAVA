public class C6Polymorphism {

    // Method Overloading : Compile time Polymorphism
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2,3 ));
        System.out.println(calc.sum((float)2.4,(float)3.5 ));
        System.out.println(calc.sum(2,3, 5 ));
    }
}

class Calculator{
    int sum (int a, int b){
        return a+b;
    }
    float sum (float a, float b){
        return a+b;
    }
    int sum (int a, int b, int c){
        return a+b+c;
    }
    
}
