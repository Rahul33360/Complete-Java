package QuesOnFunc;

import java.util.Scanner;

public class randNumBetweenRange {
    public static void main(String[] args) {
        randomNumBetweenRange();
    }

    public static void randomNumBetweenRange () {
        Scanner sc = new Scanner(System.in);
        int min = 1;
        System.out.print("Enter the max Num  ");
        int max = sc.nextInt();
        System.out.println(Math.random());
        int num = min + (int)(Math.random() * ((max - min) + 1));
        System.out.println("Random Number is  " + num);
    }
}
