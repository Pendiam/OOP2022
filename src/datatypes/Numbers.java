package datatypes;

import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {
        // int[] numbers = new int[5];
        // numbers[0] = 1;
        // numbers[1] = 25;
        // numbers[2] = 8;
        // numbers[3] = 6;
        // numbers[4] = 60;
        int[] numbers = { 1, 25, 8, 6, 60 };
        System.out.println(numbers.length);
        System.out.println(numbers[3]);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));





        // for (int number : numbers) {
        // System.out.println(number);
        // }
        // // System.out.println(numbers.length);
        // // Arrays.sort(numbers);
        // System.out.println(Arrays.toString(numbers));

        // int[][] twoD = new int[2][3];
        // twoD[0][0] = 1;
        int[][] twoD = {{1,2,3},{4,5,6}};
        
        System.out.println(Arrays.deepToString(twoD));

    }

}
