package Basics;

import java.util.Scanner;

public class percentageOfStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maths Marks... ");
        int Maths = sc.nextInt();
        System.out.print("Enter Hindi Marks... ");
        int Hindi = sc.nextInt();
        System.out.print("Enter English Marks... ");
        int English = sc.nextInt();
        System.out.print("Enter Physics Marks... ");
        int Physics = sc.nextInt();
        System.out.print("Enter Chemistry Marks... ");
        int Chemistry = sc.nextInt();
        int totalMarks = 500;
        int scoredMarks = Maths+Hindi+English+Physics+Chemistry;
        float percentage = ((float) scoredMarks /totalMarks);
        percentage *= 100;

        System.out.print("You Got " +  percentage + "% Percentage ");
        sc.close();
    }
}
