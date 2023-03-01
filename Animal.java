public class Animal {
    // Attributes
    private String name;
    private int age;


    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // Methods
    public void eat() {
        System.out.println(name + " is eating!");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}