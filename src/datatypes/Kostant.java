package datatypes;

import java.util.Scanner;

public class Kostant {
    static final float PI = 3.14F;

    static double getArea(float radius) {
        double area = PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float rad = input.nextFloat();
        System.out.printf("The are of a circle with a radius of %f is %f ", rad, getArea(rad));
        input.close();

    }

}
