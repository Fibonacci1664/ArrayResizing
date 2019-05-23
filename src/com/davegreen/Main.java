package com.davegreen;

import java.util.Scanner;                                       // While it would be very simple just to create a new array when one is required, if for some reason you need to preserve
                                                                // any and/or all data stored up to that point in time from the array then it would be more applicable to RESIZE the original
public class Main {                                             // array and in doing so preserving the original values that were entered in to the original array elements.

    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];                // Here we see an int array called baseData with 10 elements 0 - 9 inclusive, goto resizeArray.

    public static void main(String[] args) {
        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
        //System.out.println("Enter 12 integers:");             // If we run this line of code and the next, what will happen is we will actually override ALL of the elements up to 12 as we are
        //getInput();                                           // being asked to redefine ALL 12 elements.
        //baseData[10] = 67;                                    // If we run this line of code and the next, and not the tow lines of code above we will see that we have our original 10 values
        //baseData[11] = 34;                                    // that have been carried over in to the resized array and then what we are saying is that elements 10 and 11 will be values 67 and 34
        printArray(baseData);                                   // respectively, remembering that elements 10 and 11 are numbers 11 and 12 as we count from zero.

    }

    private static void getInput()                          // This method is to get the input from the console and update the baseData arrays elements directly with the values that have been input.
    {
        for(int i = 0; i < baseData.length; i++)
            baseData[i] = s.nextInt();
    }

    private static void printArray(int[] arr)               // printArray method simply prints out the array elements contents.
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static void resizeArray()                       // Next we see that we are taking the original array baseData and storing that into an int array variable called "original".
    {
        int[] original = baseData;                          // Next we then redefine baseData as a new int array with 12 elements 0 - 11 inclusive, then once into the loop we iterate taking
                                                            // each element from the original array and storing it into the new array, until the termination condition is met which in this case
        baseData = new int[12];                             // is the original arrays length of 10, thus upon exiting the loop we will now have a RESIZED the array from 10 to 12 with the first 10 elements
        for (int i = 0; i < original.length; i++)           // having already been populated by the original values thereby leaving 2 empty elements at default zero ready for use, noting that the array variable name
            baseData[i] = original[i];                      // is still the same "baseData" as can been seen when we redefined the element size to 12.
    }

}