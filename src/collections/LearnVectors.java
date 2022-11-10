package collections;

import java.util.Vector;

public class LearnVectors {
    public static void main(String[] args) {
        Vector<String> days = new Vector<String>(7);
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("sunday");
        
        days.remove("sunday");
        days.add(6, "Sunday");
    
        System.out.println(days);
        System.out.println("The capacity of days vector:" + days.capacity());
        System.out.println("The fourth day of the week: " + days.get(3));
        System.out.println(days.contains("Sunday"));

        

    }
}
