package collections;

import java.util.HashMap;

public class LearnMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<String, Integer>();
        marks.put("SCS B202", 70);
        marks.put("SCS B204", 92);
        marks.put("SCS B205", 66);
        marks.put("SCS B207", 78);
        marks.put("SCS B209", 84);
        marks.put("SMA B201", 74);
        marks.put("SMA B203", 76);
        marks.put("SMA B261", 82);

        marks.remove("SCS B205");
        System.out.println(marks);

        System.out.println(marks.containsKey("SCS B204"));
        System.out.println(marks.containsValue(74));
        System.out.println("Number of courses: " + marks.size());
        System.out.println(marks.replace("SMA B203", 76, 77));
        System.out.println(marks.keySet());
        System.out.println(marks.values());
        System.out.println(marks.get("SCS B204"));
    }

}
 