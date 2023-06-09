import java.util.*;

public class RandomInput {

    // Create a random number generator.
    private static final Random generator = new Random();

    // Create a scanner to read input from the console.
    static Scanner sc = new Scanner(System.in);

    // Define some constants for use in the program.
    private static int ten4 = 10000, ten9 = 1000000000, tenm9 = -1000000000;

    // Define some ANSI escape codes for coloring output in the console.
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";

    // This method generates a random integer between start and end (inclusive).
    public static int getRandomInRange(int start, int end) {
        return start + generator.nextInt(end - start + 1);
    }

    // This method takes an array of integers and a target value, and returns the indices
    // of two elements in the array whose sum is equal to the target.
    

    public static void main(String[] args) {
        // Loop until we find an array that has two elements whose sum is equal to the target.
        for(int cnt=0; cnt<5; cnt++){
            System.out.println("Random Test Case No. "+(cnt));
            while (true) {
                // Generate a random array of integers.
                int n = getRandomInRange(2, ten4-1);
                int nums[] = new int[n];
                for (int i = 0; i < n; i++) {
                    nums[i] = getRandomInRange(tenm9, ten9);
                }
    
                // Generate a random target value.
                int target = getRandomInRange(tenm9, ten4);
    
                // Find the indices of two elements in the array whose sum is equal to the target.
                int[] result = Solution.twoSum(nums, target);
    
                // If we found two elements whose sum is equal to the target, print out the result.
                if (result.length != 0) {
                    // Print out the target value and the indices of the two elements.
                    System.out.print("Indices that add up to " + YELLOW + target + RESET + " are ");
                    for (int i : result) System.out.print(RED + i + RESET + " ");
    
                    // Print out the entire array with the two elements highlighted in blue.
                    System.out.println();
                    System.out.print("Interger values are ");
                    for (int i : nums) {
                        if (i == nums[result[0]] || i == nums[result[1]]) System.out.print(BLUE + i + RESET + " ");
                    }
                    System.out.println();
                    // Break out of the loop once we find a solution.
                    break;
                }
            }
        }
    }
}