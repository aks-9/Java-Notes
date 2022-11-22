/*
Reading data from the Keyboard :

Scanner class of 'java.util 'package is used to take input from the user's keyboard.The Scanner class has many methods for taking input from the user depending upon the type of input.

*/

package com.company;
import java.util.Scanner; // Importing  the Scanner class

public class CWH_05_TakingInpu {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");

        // To use any of the methods of the Scanner class, first, we need to create an object of the Scanner class 
        Scanner sc = new Scanner(System.in); //Creating an object named "sc" of the Scanner class. Taking an integer input from the keyboard using 'System.in'


//        System.out.println("Enter number 1");
//        int a = sc.nextInt(); //(Method to read from the keyboard)

//        float a = sc.nextFloat();
//        System.out.println("Enter number 2");

//        int b = sc.nextInt();
//        float b = sc.nextFloat();

//        int sum = a +b;
//        float sum = a +b;
//        System.out.println("The sum of these numbers is");
//        System.out.println(sum);

// To check if the input from keyboard is an 'int' literal, we use 'hasNetInt()' method available for 'sc' object.
//        boolean b1 = sc.hasNextInt(); 
//        System.out.println(b1); //prints 'true' or 'false'.

//        String str = sc.next(); // prints next word

        String str = sc.nextLine(); // prints the next whole sentence.
        System.out.println(str);

    }
}


