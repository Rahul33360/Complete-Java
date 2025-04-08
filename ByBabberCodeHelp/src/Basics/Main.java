package Basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello Bro!");
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the Age ");
        long age = num.nextLong();
        System.out.print("Enter the Float value ");
        float value = num.nextFloat();
        System.out.print("Enter the String  ");
        String st = num.next();
        // For character, we use same nextLine() and use extract 0th index for first character
        System.out.print("Enter the Char  ");
        char ch = num.next().charAt(0);


        System.out.println("Printing the Character  " + ch);
        System.out.println("Your String is   " + st);
        System.out.println("Your Age is   " + age);
        System.out.println("Printing the Floating value  " + value);


        num.close(); // best practice, must close this Scanner object, to prevent resource leak.
//       There is a term called Garbage collector (inbuilt) in java, Prevents memory leaks in java. (not present in c++)
    }
}