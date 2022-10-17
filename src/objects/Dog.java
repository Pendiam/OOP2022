package objects;

public class Dog {
    // Attributes or data - instance variables
    private String name;
    private String breed;
    private int age;

    // constructors
    public Dog() {
        this.name = "no name yet";
        this.breed = "unknown";
        this.age = 0;
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // functions or code - methods
    public int getAgeInHumanYears() {
        int humanYears = 0; // local variable

        if (age <= 2) {
            humanYears = age * 11;
        }

        humanYears = 22 + ((age - 2) * 5);

        return humanYears;
    }

    public void writeOutput() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age:" + age);
        System.out.println("Age in human years: " + getAgeInHumanYears());
    }

    // getters (accessors)
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    // setters(mutators)
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
