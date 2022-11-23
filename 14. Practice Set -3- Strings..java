//* Practice Set on Java Strings (Must Solve!)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //* Problem 1 : Write a Java program to convert a string to lowercase.
        //String name = "Jack Parker";
        //name = name.toLowerCase();
        //System.out.println(name);

        //* Problem 2: Write a Java program to replace spaces with underscores.
        //String text = "To My     Friend";
        //text = text.replace(" ", "_");
        //System.out.println(text);

        //* Problem 3: Write a Java program to fill in a letter template which looks like below:
        // letter = “Dear <|name|>, Thanks a lot”
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Sachin");
        System.out.println(letter);

        //* Problem 4: Write a Java program to detect double and triple spaces in a string.
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //* Problem 5: Write a program to format the following letter using escape sequence characters.
        //Letter = “Dear Harry, This Java Course is nice. Thanks”
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);
       
    }
}