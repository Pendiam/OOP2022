package lombokTest;

import inheritance.Gender;

public class LombokDemo {
    public static void main(String[] args) {
        Student pat = new Student("SB30/PU/05450/22", "Patrick", "Kipyegon", "Ruto", Gender.Male, "+254727775893",
                "p.ruto@mail.com");
                System.out.println(pat.toString());

    }
}
