public class Animal {

    // Encapsulation. Health attribute hidden using private access modifier. Makes it not directly accessible.
    // Public getters and setters used to access attribute instead.
    private int health;

    public void getHealth() {
        System.out.println(health);
    }

    public void setHealth(int health) {
        this.health = health;
    }


    // Polymorphism because method overridden in subclass
    public void speak() {
        System.out.println("I am an animal");
    }

    // Inheritance because method inherited by cat
    public void inherited() {
        System.out.println("I am defined in Animal, but I am inherited by Cat.");
    }
}
