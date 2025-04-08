package Basics;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        int income;
        Scanner val = new Scanner(System.in);
        System.out.print("Enter Your Income... ");
        income = val.nextInt();
        //    if else conditionals
//        if(income > 1000000)
//            System.out.println("You are Rich. ");
//        else
//            System.out.println("Sorry, You should earn more!... ");

        // ternary conditionals
        String ans = income > 1000000 ? "You are Rich..." : "Your need to earn more... ";
        System.out.println(ans);

    }
}
