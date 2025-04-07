abstract class Animal {
    abstract void walks();
    public void eats(){
        System.out.println("animal eats");
    }
}

class Dog extends Animal {
    @Override
    void walks() {
        System.out.println("Dog walks");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.walks();
        dog.eats();
    }
}
