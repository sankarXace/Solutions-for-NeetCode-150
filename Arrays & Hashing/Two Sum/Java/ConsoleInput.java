import java.util.*;

public class ConsoleInput {
    static Scanner sc = new Scanner(System.in);

    // Define some ANSI escape codes for coloring output in the console.
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

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
        }
    }
}