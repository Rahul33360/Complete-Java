package QuesOnFunc;


import java.util.Scanner;

public class avgOfTwoNum {

    public static void main(String[] args) {
        func();
    }
    public static void func () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First num and Second num  ");
        float first_Num = sc.nextInt();
        float second_Num = sc.nextInt();
        System.out.println("Average of these nums is  " + (first_Num + second_Num)/2 );
        sc.close();
    }
}
