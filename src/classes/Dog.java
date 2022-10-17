package classes;

public class Dog {
    // Attributes or data - instance variables
    public String name;
    public String breed;
    public int age;

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

}
