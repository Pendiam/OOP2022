package collections;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("----original stack---");
        System.out.println(stack);

        stack.pop();

        System.out.println("----mordified stack---");

        System.out.println(stack);

    }
    
}
