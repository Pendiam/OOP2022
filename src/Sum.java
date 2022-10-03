import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner kb = new Scanner(System.in);
        System.out.print(" Enter first integer: ");
        num1 = kb.nextInt();
        System.out.print(" Enter second integer: ");
        num2 = kb.nextInt();
        kb.close();
        sum = num1 + num2;
        System.out.printf("The sum of %d and %d is %d", num1, num2, sum);

    }

}
