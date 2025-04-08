package Basics;

import java.util.Scanner;


public class lowerToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character  ");
        String ch = sc.nextLine();
        System.out.println("Upper case  " + ch.toUpperCase());
        sc.close();
    }
}
