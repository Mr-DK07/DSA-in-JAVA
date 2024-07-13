public class C6HybridInheritance {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.legs = 2;
        System.out.println(h.legs);
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

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims");
    }
}

class Mammal extends Animal {
    int legs;
}

class Bird extends Animal {
    String name;
}

class Tuna extends Fish {
    String color;
}

class Shark extends Fish {
    int size;
}

class Peacock extends Bird {
    void fly() {
        System.out.println("fly");
    }
}

class Dog extends Mammal {
    String breed;
}

class Cat extends Mammal {
    String breed;
}

class Human extends Mammal {
    String name;
}