package inheritance;

public class SomeClass {
    public static void main(String[] args) {
        // Person p = new Person();
        // Student s = new Student();
        // Undergraduate u = new Undergraduate();

        // Person robin = new Student();
        Student green = new Undergraduate("Green", Gender.Female, 20, "S30/PU/40273/20", "Y2S1");
        // Person pius = new Undergraduate();

        green.writeOutPut();

        // System.out.println(s instanceof Person);
        // System.out.println(s instanceof Undergraduate);
        // System.out.println(u instanceof Person);
        // System.out.println(u instanceof Student);

    }
}
