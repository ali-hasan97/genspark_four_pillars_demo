// abstraction, polymorphism, inheritance, encapsulation

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Animal animal = new Animal();
        Cat cat = new Cat();

        // Example of polymorphism (run-time)
        animal.speak();
        cat.speak();

        // Example of encapsulation (data hiding)
        // Health attribute not directly accessible. Using public getters and setters instead.
        cat.setHealth(85);
        cat.getHealth();

        // Example of inheritance
        // Inherited method from Animal
        cat.inherited();

        // Example of abstraction
        // Movement interface abstracts away implementation of move method
        Runner runner = new Runner();
        Walker walker = new Walker();
        runner.move();
        walker.move();
    }
}