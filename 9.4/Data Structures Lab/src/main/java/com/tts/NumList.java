package com.tts;

import java.util.ArrayList;
import java.util.Scanner;

public class NumList {
    public static void myNumbers() {
        //Create our integers arraylist
        ArrayList<Integer> integersList = new ArrayList<Integer>();
        Scanner inputDevice = new Scanner(System.in);
        int userInput;
        //Get 5 numbers from the user
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a number: ");
            userInput = inputDevice.nextInt();
            integersList.add(userInput);
            System.out.println(integersList);
        }
        //Sum the five numbers
        int sum = 0;
        for (Integer myInt : integersList) {
            sum = sum + myInt;
        }
        System.out.println("The sum of your five numbers is: " + sum);
        //Find the product of these 5 numbers
        int product = 1;
        for (Integer myInt : integersList) {
            product = product * myInt;
        }
        System.out.println("The product of your five numbers is: " + product);
        //Find the largest number
        int largest = 0;
        for (Integer myInt : integersList) {
            if (myInt > largest) {
                largest = myInt;
            }
        }
        System.out.println("The largest of your five numbers is: " + largest);
        //Find the smallest number
        int smallest = largest;
        for (Integer myInt : integersList) {
            if (myInt < smallest) {
                smallest = myInt;
            }
        }
        System.out.println("The smallest of your five numbers is: " + smallest);
    }
}
