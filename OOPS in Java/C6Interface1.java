public class C6Interface1 {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatMeat();
        b.eatPlant();
    }
}

// Multiple Inheritance
interface Carnivorous {
    void eatMeat();
}

interface Herbivorous {
    void eatPlant();
}

class Bear implements Carnivorous, Herbivorous {
    public void eatMeat() {
        System.out.println("eat meat");
    }

    public void eatPlant() {
        System.out.println("eat plant");
    }
}
