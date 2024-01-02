package org.example.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoNumberSum {
    public static int[] approachOne(int[] array, int targetSum) {
        for(int i = 0; i < array.length; i++ ){
            for(int j = i + 1; j < array.length; j++){
                if((array[i] + array[j] == targetSum) && array[i] != array[j] ){
                   return new int[] {array[i], array[j]};
                }

            }

        }

        return new int[0];
    }

    public static int[] approachTwo(int[] array, int targetSum){

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i : array){

            if(hashMap.containsValue(targetSum - i)){
                return new int[] {i, targetSum - i};
            }

            hashMap.put(i, i);

        }

        return new int[0];
    }

    public static void solutions(){
        int[] result1 = approachOne(new int[] { 3, 5, -4, 8, 11, 1, -1, 6 }, 10);
        int[] result1b = approachTwo(new int[] { 3, 5, -4, 8, 11, 1, -1, 6 }, 10);
        System.out.println(Arrays.toString(result1));  // Expected Output: [11, -1]
        System.out.println(Arrays.toString(result1b));  // Expected Output: [11, -1]

        // Test Case 2: Valid case with a different solution
        int[] result2 = approachOne(new int[] { 4, 6, 1, -3, 2, 8, 2 }, 5);
        System.out.println(Arrays.toString(result2));   // Expected Output: [1, 4]

        // Test Case 3: No solution
        int[] result3 = approachOne(new int[] { 1, 2, 3, 4, 5 }, 20);
        System.out.println(Arrays.toString(result3));  // Expected Output: []

        // Test Case 4: Empty array
        int[] result4 = approachOne(new int[] {}, 10);
        System.out.println(Arrays.toString(result4));  // Expected Output: []

        // Test Case 5: Single-element array (no solution)
        int[] result5 = approachOne(new int[] { 5 }, 5);
        System.out.println(Arrays.toString(result5));  // Expected Output: []
    }



}
