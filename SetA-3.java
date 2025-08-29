//Assignment2 SetA-3

package SYCLass;

import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        if (args.length < 5) {
            System.out.println("Please enter 5 numbers as command line arguments.");
            return;
        }

        // Store numbers in an array
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);  // convert String to int
        }

        // Sort the numbers
        Arrays.sort(numbers);

        // Print sorted numbers
        System.out.println("Sorted Numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
