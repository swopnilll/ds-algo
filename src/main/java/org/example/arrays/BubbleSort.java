package org.example.arrays;

import java.util.Arrays;

public class BubbleSort {

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sol1(int[] array){

        int count = 0;

        boolean swaped;

    for(int j = 0; j < array.length - 1; j++){

         swaped = false;
        for(int i = 0; i < array.length - j - 1; i++){
            count++;
            if(array[i] > array[i + 1]){
                swap(array, i, i + 1);
                swaped = true;
            }
        }

        if(!swaped){
            break;
        }
    }

        System.out.println(count);
        System.out.println(Arrays.toString(array));
    }

}
