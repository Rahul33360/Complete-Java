package Basics;

import java.util.Scanner;

public class questionVotingconditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age...  ");
        int age = sc.nextInt();
        if(age >= 18)
            System.out.println("You can Vote... ");
        else System.out.println("Sorry You are can't Vote... ");
        sc.close();
    }
}
