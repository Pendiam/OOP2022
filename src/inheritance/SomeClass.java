package inheritance;

public class SomeClass {
    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();
        Undergraduate u = new Undergraduate();

        System.out.println(s instanceof Person);
        System.out.println(s instanceof Undergraduate);
        System.out.println(u instanceof Person);
        System.out.println(p instanceof Student);

        System.out.println("------------Michael Object--------------");
        Person michael = new Student();
        michael.writeOutPut();

        System.out.println("------------Luta Object--------------");

        Undergraduate luta = new Undergraduate("Conchella Luter", Gender.Female, 20, "SB62/PU/41440/23", "Y2S1");
        luta.writeOutPut();

        

    }
}
