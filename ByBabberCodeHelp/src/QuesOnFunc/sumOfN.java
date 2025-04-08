package QuesOnFunc;
import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
        sumOfNumbers();
    }
    public static void sumOfNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Value  ");
        int val = sc.nextInt();
        int sum=0;
        while(val > 0) {
            sum += val;
            val--;
        }

        System.out.println(sum);
        sc.close();
    }
}
