package classes;

public class DogDemo {
    public static void main(String[] args) {
        // objects
        Dog s = new Dog();
        // states - values assigned
        s.name = "Scobby Doo";
        s.breed = "Great Dane";
        s.age = 5;

        System.out.print(s.name + " is a " + s.breed + ". ");
        System.out.println("He is " + s.age + " years old or "
                + s.getAgeInHumanYears() + " years in human years.");
        
        Dog k = new Dog();
        k.name = "Simba";
        k.breed = "German Shephard";
        k.age = 2;

        k.writeOutput();


    }

}
