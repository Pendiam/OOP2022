package control;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int[] marks = new int[10];
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("Enter marks for student %d : ", i + 1);
            marks[i] = kb.nextInt();
        }
        kb.close();
        // advaced for loop
        for (int mark : marks) {
            System.out.println(mark);
        }

    }
}
