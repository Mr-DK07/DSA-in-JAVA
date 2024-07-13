public class C6Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("eat");
    }

    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "black";
    }

    void walk() {
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "red";
    }

    void walk() {
        System.out.println("walk on 2 legs");
    }
}
