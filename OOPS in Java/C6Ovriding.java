public class C6Ovriding {

    // Method Overriding : Run time Polymorphism
    public static void main(String[] args) {
        Dear d = new Dear();
        d.eat();
    }
}

class Janwar {
    String color;

    void eat() {
        System.out.println("eat");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

class Dear extends Janwar{
    void eat(){
        System.out.println("eat grass");
    }
}