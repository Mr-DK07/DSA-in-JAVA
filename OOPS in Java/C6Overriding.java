public class C6Overriding {

    // Method Overriding : Run time Polymorphism
    public static void main(String[] args) {
        Dear d = new Dear();
        d.eat();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eat");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

class Dear extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}