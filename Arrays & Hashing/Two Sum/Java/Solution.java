import java.util.HashMap;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        // Create a hash map to store previously encountered elements and their indices.
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        // Iterate over the array.
        for (int i = 0; i < nums.length; i++) {
            // Get the current element and its complement.
            int num = nums[i];
            int diff = target - num;

            // If the complement has already been encountered, return the indices of the two elements.
            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            // Otherwise, add the current element to the hash map.
            prevMap.put(num, i);
        }

        // If no two elements were found whose sum is equal to the target, return an empty array.
        return new int[] {};
    }
}