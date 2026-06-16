/**
 *  Java program to rotate an array 90 degrees clockwise by 90 Degrees.
 */

package com.myarrays;


/**
 * Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an array of 2 dimensions.
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // Printing an array to console.
        for (int index = 0; index < array.length; index++) {
            for (int index1 = 0; index1 < array[0].length; index1++) {

                System.out.print(array[index][index1] + " ");
            }

            // Next line.
            System.out.println();
        }

        // Rotating the array.
        int[][] newArray = new int[array.length][array[0].length];

        // Filling newArray with integers.

        // Transpose the array.
        for (int index = 0; index < array.length; index++) {
            for (int index1 = 0; index1 < array[0].length; index1++) {
                newArray[index][index1] = array[index1][index];
            }
        }


        // Reversing the lines of array.
        for (int index = 0; index < array.length; index++) {

            int start = 0;
            int end = array[index].length - 1;

            while (start < end) {


                // Storing value.
                int value = newArray[index][start];

                // Replacing values.
                newArray[index][start] = newArray[index][end];
                newArray[index][end] = value;

                // Decrementing indexes.
                start++;
                end--;
            }
        }

        System.out.println("************");

        // Printing newArray to console.
        for (int index = 0; index < array.length; index++) {
            for (int index1 = 0; index1 < array[0].length; index1++) {

                System.out.print(newArray[index][index1] + " ");

            }

            // Next line.
            System.out.println();
        }
    }
}