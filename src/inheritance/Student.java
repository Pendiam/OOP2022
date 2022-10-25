package inheritance;

public class Student extends Person {
    private String reg_id;

    // constructors
    public Student() {
        super();
        this.reg_id = "Uregistered";
    }

    public Student(String name, Gender gender, int age, String reg_id) {
        super(name, gender, age);
        this.reg_id = reg_id;
    }

    @Override
    protected void writeOutPut() {
        super.writeOutPut();
        System.out.println("Registation : " + reg_id);
    }
}
