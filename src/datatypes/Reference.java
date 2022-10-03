package datatypes;

import java.awt.Point;
import java.util.Date;

public class Reference {
    public static void main(String[] args) {
        Date now = new Date();
        now.getTime();//have internal members
        System.out.println("Time: " + now);

        /*
         * reference variables store memory address for the value
         */
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println("Point2: " + point2);

    }
}
