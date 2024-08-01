// 4 types of inheritance: Single level, Multilevel, hierarchial, hybrid

public class C6Inhrtnce { 
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();

        Dog dooby = new Dog();
        dooby.breathe();
        dooby.legs = 4;
        System.out.println(dooby.legs);
    }
}

class Anml {
    String color;

    void eat() {
        System.out.println("eat");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

// Multilevel inheritance and hierarchial

class Fish extends Anml {
    int fins;

    void swim() {
        System.out.println("swims");
    }
}

class Mammal extends Anml {
    int legs;
}

class Dog extends Mammal {
    String breed;
}