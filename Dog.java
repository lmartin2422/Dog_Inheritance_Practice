public class Dog extends Animal {  // Dog is the subclass/derived class/child class

    // Subclass Constructor
    public Dog(String name, int age) {
        super(name, age);
    }

    // Methods
    public void bark() {
        System.out.println("Dog class (child class): " + getName() + " is barking");
    }
}