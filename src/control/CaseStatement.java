package control;

import java.util.Scanner;

public class CaseStatement {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        char grade = kb.next().toUpperCase().charAt(0);
        kb.close();
        switch (grade) {
            case 'A':
                System.out.println("Distinction");
                break;
            case 'B':
                System.out.println("Merit");
                break;
            case 'C':
                System.out.println("Credit");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'E':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Inavlid grade");
                break;
        }

    }
}
