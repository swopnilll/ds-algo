package org.example.arrays;

import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {

        public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

            int a = 0;
            int b = 0;

            while(b < sequence.size() && a < array.size()){
                if(array.get(a).equals(sequence.get(b))){
                    b = b + 1;
                }

                a = a + 1;
            }

            return b == sequence.size();


    }

    public static void solution(){

        // Test Case 1: Valid subsequence
        List<Integer> array1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> sequence1 = Arrays.asList(2, 4);
        System.out.println(isValidSubsequence(array1, sequence1)); // Should print true

        // Test Case 2: Invalid subsequence
        List<Integer> array2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> sequence2 = Arrays.asList(2, 6);
        System.out.println(isValidSubsequence(array2, sequence2)); // Should print false

        // Test Case 3: Valid subsequence with repeated elements
        List<Integer> array3 = Arrays.asList(1, 2, 2, 3, 4, 5);
        List<Integer> sequence3 = Arrays.asList(2, 3);
        System.out.println(isValidSubsequence(array3, sequence3)); // Should print true

        // Test Case 4: Empty sequence (should always be valid)
        List<Integer> array4 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> sequence4 = Arrays.asList();
        System.out.println(isValidSubsequence(array4, sequence4)); // Should print true

        // Test Case 5: Empty array (should be invalid for any non-empty sequence)
        List<Integer> array5 = Arrays.asList();
        List<Integer> sequence5 = Arrays.asList(1, 2, 3);
        System.out.println(isValidSubsequence(array5, sequence5)); // Should print false

    }
}
