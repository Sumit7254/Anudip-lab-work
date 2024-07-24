// Superclass Animal
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of each class
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Display objects of each class
        System.out.println("Animal:");
        animal.makeSound();

        System.out.println("\nDog:");
        dog.makeSound();

        System.out.println("\nCat:");
        cat.makeSound();

        // Demonstrate method overriding with polymorphism
        System.out.println("\nPolymorphism:");
        Animal myAnimal = new Dog();
        myAnimal.makeSound();

        myAnimal = new Cat();
        myAnimal.makeSound();
    }
}