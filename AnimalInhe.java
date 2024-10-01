// Interface: Animal
interface Animal {
    void sound();  // Abstract method for sound
    void eat();    // Abstract method for eating
}

// Class: Dog implementing Animal interface
class Dog implements Animal {
    // Implementing the sound method for Dog
    public void sound() {
        System.out.println("Dog barks: Woof Woof");
    }

    // Implementing the eat method for Dog
    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

// Class: Cat implementing Animal interface
class Cat implements Animal {
    // Implementing the sound method for Cat
    public void sound() {
        System.out.println("Cat meows: Meow Meow");
    }

    // Implementing the eat method for Cat
    public void eat() {
        System.out.println("Cat eats fish.");
    }
}

// Main class to test the implementation
public class AnimalInhe {
    public static void main(String[] args) {
        // Creating Dog object
        Dog dog = new Dog();
        System.out.println("Dog Behavior:");
        dog.sound();  // Calling sound method
        dog.eat();    // Calling eat method

        System.out.println();

        // Creating Cat object
        Cat cat = new Cat();
        System.out.println("Cat Behavior:");
        cat.sound();  // Calling sound method
        cat.eat();    // Calling eat method
    }
}
