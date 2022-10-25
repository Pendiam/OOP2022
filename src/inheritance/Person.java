package inheritance;

public class Person {
    private String name;
    private Gender gender;
    private int age;

    // constructors
    public Person() {
        this.name = "No name yet";
        this.gender = Gender.Unknown;
        this.age = 0;
    }

    public Person(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    protected void writeOutPut() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }
}
