package Basics;

import java.util.Scanner;

public class upperToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter the character  ");
        String ch = sc.nextLine();
        System.out.println("Lower case  " + ch.toLowerCase());
        sc.close();
    }
}
