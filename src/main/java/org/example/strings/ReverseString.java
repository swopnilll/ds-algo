package org.example.strings;

import java.util.Arrays;

public class ReverseString {
    public static void solutionOne(String str){
       // Using string builder to reverse a string
        StringBuilder rvs = new StringBuilder(str).reverse();

        System.out.println(rvs.toString());
    }

    // This is not a good way because in each iteration, a new instance of string is created.
    // As string in immutable in Java.
    public static void solutionTwo(String str){

        String reverse = "";

        for(char ch : str.toCharArray()){
            reverse = ch + reverse;
        }

        System.out.println(reverse);

    }


    // Solution to problem specified in solution 2
    public static void solutionThree(String str){
        char[] charArray = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;
        char temp;

        while(right > left){
            temp = charArray[right];
            charArray[right] = charArray[left];
            charArray[left] = temp;

            left++;
            right --;
        }

        String reversedString = new String(charArray);

        System.out.println(reversedString);
    }

    // Using String Builder

    public static void solutionFour(String str){
        StringBuilder reversedString = new StringBuilder();

        for(char ch : str.toCharArray()){
            // add new character at index 0 in each iteration
            reversedString.insert(0, ch);
        }

        System.out.println(reversedString.toString());
    }

}
