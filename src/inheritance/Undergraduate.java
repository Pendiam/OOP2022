package inheritance;

public class Undergraduate extends Student {
    private String stage;

    // constructors
    public Undergraduate() {
        super();
        this.stage = "Y0S0";
    }

    public Undergraduate(String name, Gender gender, int age, String reg_id, String stage) {
        super(name, gender, age, reg_id);
        this.stage = stage;
    }

    @Override
    protected void writeOutPut() {
        super.writeOutPut();
        System.out.println("Stage : " + stage);
    }

    


    

}
