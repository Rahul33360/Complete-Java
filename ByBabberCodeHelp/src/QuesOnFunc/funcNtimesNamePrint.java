package QuesOnFunc;
import java.util.Scanner;

public class funcNtimesNamePrint {
    public static void main(String[] args) {
        calling();
        return ;
    }
    public static void calling() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name  ");
        String s = sc.nextLine();
        System.out.print("Number of times to print your Name  ");
        int times = sc.nextInt();
        for(int i=0; i<times; i++)
            System.out.println(s);

        sc.close();
    }
}
