class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }

    void sleep() {
        System.out.println("Animal sleeps.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class Q4AnimalDog {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.sleep();
        d.bark();
    }
}