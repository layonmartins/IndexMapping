/**
 * Author: Layon Martins
 * Index Mapping (or Trivial Hashing) with negatives allowed in 2D array
 * Language: Java
 * Reference: https://www.geeksforgeeks.org/index-mapping-or-trivial-hashing-with-negatives-allowed/
 *  */

// Java program to implement direct index  
// mapping with negative values allowed.

import java.lang.Math;

public class IndexMapping {
    final static int MAX = 10;

    // Since array is global, it is initialized as 0.
    static boolean[][] myArray = new boolean[2][MAX + 1];
    static boolean[][] test = new boolean[2][10];

    // Searching if X is Present in the given array or not
    static void search(int X) {
        String result = "";
        if (X >= 0) // If X is positive
            result = (myArray[0][X] == true) ? "" : "Not";
        else // If X is negative take the absolute value of X.
            result = (myArray[1][Math.abs(X)] == true) ? "" : "Not";

        System.out.println(X + " is " + result + " contained in myArray");
    }

    // Insert X in the array has[][]
    static void insert(int X) {
        System.out.println("Insertint " + X);
        if (X >= 0) {
            myArray[0][X] = true;
        } else
            myArray[1][Math.abs(X)] = true;

        print();
    }

    static void insert(int array[]) {
        System.out.println("Inserting a[]");
        for (int a : array) {
            if (a >= 0)
                myArray[0][a] = true;
            else
                myArray[1][Math.abs(a)] = true;
        }

        print();
    }

    // Print array
    static void print() {
        System.out.println("################## Print myArray[][] ##################");
        // print positive numbers
        System.out.print("0 -> ");
        for (int i = 0; i < MAX; i++) {
            if (myArray[0][i] == true) {
                System.out.print(i + "[X] ");
            } else
                System.out.print(i + "[ ] ");
        }
        System.out.println();

        // print negative numbers
        System.out.print("1 -> ");
        for (int i = 0; i < MAX; i++) {
            if (myArray[1][i] == true) {
                System.out.print(i + "[X] ");
            } else
                System.out.print(i + "[ ] ");
        }

        System.out.println("\n");
    }

    // Drive code
    public static void main(String args[]) {
        // Print an empty myArray
        print();

        // Create an array of positive and negative numbers
        int a[] = { 0, -1, 2, -3, 4, -5, 6, -7, 8, -9 };
        // Insert that array in myArray and print
        insert(a);

        // Insert a single number and print
        insert(1);

        // check if a give number is present in myArray
        search(2);
        search(-4);

    }
}