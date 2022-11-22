// Chapter 1 – Practice Set 


package com.company;

import java.util.Scanner;

public class CWH_Ch1_PS {
    public static void main(String[] args) {

// Question 1 : Write a program to sum three numbers in Java.

//        int a = 4;
//        int b = 17;
//        int c =6;
//        int sum = a + b+c;
//        System.out.println(sum);

// Question 2: Write a program to calculate CGPA using marks of three subjects (out of 100)

//    float subject1 = 45; //using float as we need the end result in 'float'. If we use 'int', decimals will be lost in the end result.

//    float subject2 = 95;
//    float subject3 = 48;
//    float cgpa = (subject1 + subject2 + subject3) / 30;
//    System.out.println(cgpa);

// Question 3: Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.

//        System.out.println("What is your name");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println("Hello " + name + " have a good day!");

//  Question 4 : Write a Java program to convert Kilometers to miles.
  System.out.println("Enter the distance in Kilo meters");
  Scanner sc = new Scanner(System.in);
  float KMs = sc.nextFloat();

  double miles = KMs * 0.621371 ;
  System.out.println("Distance in Miles: " + miles );

//  Question 5 : Write a Java program to detect whether a number entered by the user is an integer or not.
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt()); // printing out the 'true' or 'false' value without using an extra boolean variable.
    }

} 
