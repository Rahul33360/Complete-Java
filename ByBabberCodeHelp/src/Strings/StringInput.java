package Strings;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your First Name  ");
        String first = sc.next();   // it stop taking input after space
        sc.nextLine(); // consumes leftover // run without this u'll understand
        System.out.println("Your Last Name   ");
        String last = sc.nextLine();    // stop taking input when hit enter

        System.out.println("Name is : "  + first + " "+ last);



    }
}
