package objects;

public class DogDemo {
    public static void main(String[] args) {
        // objects
        System.out.println("------- object one ------");
        Dog s = new Dog();
        // states - values assigned
        s.setName("Scobby Doo");
        s.setBreed("Great Dane");
        s.setAge (5);

        System.out.print(s.getName() + " is a " + s.getBreed() + ". ");
        System.out.println("He is " + s.getAge() + " years old or "
                + s.getAgeInHumanYears() + " years in human years.");

        System.out.println("------- object two ------");

        Dog k = new Dog("Simba", "German Shepherd",2);
        k.writeOutput();


    }

}
