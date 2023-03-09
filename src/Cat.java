public class Cat extends Animal {

    // Overrides speak method of animal (run-time polymorphism)
    @Override
    public void speak() {
        System.out.println("I am a cat");
    }
}
