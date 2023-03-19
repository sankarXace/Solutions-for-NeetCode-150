import java.io.*;
import java.util.*;

/*
 * This Java program reads input data from a file named "inputexample.txt" 
 * and processes it to find two elements in an integer array whose sum is equal to a target value.
 * The program reads in the number of test cases from the first line of the input file. 
 * For each test case, the program reads in the length of the array, 
 * creates an array of that length, reads in each element of the array, and reads in the target value. 
 * It then calls the twoSum method from a class named Solution to find the indices of the two elements 
 * whose sum is equal to the target.
 * 
 * Format:
 *      No.of Test cases T
 *      For T times :
 *          Length of Array
 *          Array elements seperated by " " space
 *          Target variable
 */

public class TextInput {

    // Define some ANSI escape codes for coloring output in the console.
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        try {
            // Open the input file.
            File file = new File("inputexample.txt");
            Scanner sc = new Scanner(file);

            // Read in the number of test cases.
            int t = sc.nextInt();
            while (t-- > 0) {
                // Read in the array length and create an array of that length.
                int n = sc.nextInt();
                int[] nums = new int[n];

                // Read in each element of the array.
                for (int i = 0; i < n; i++) {
                    nums[i] = sc.nextInt();
                }

                // Read in the target value.
                int target = sc.nextInt();

                // Find the two elements whose sum is equal to the target.
                int[] result = Solution.twoSum(nums, target);

                // If we found two elements whose sum is equal to the target, print out the
                // result.
                if (result.length != 0) {
                    // Print out the target value and the indices of the two elements.
                    System.out.print("Indices that add up to " + YELLOW + target + RESET + " are ");
                    for (int i : result)
                        System.out.print(RED + i + RESET + " ");

                    // Print out the entire array with the two elements highlighted in blue.
                    System.out.println();
                    System.out.print("Interger values are ");
                    for (int i : nums) {
                        if (i == nums[result[0]] || i == nums[result[1]])
                            System.out.print(BLUE + i + RESET + " ");
                    }
                    System.out.println();
                }
            }

            // Close the scanner to release the file resource.
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
