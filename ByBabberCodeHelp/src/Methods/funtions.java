package Methods;
import javax.lang.model.element.NestingKind;

public class funtions {
    public static void main(String[] args) {
// go to function (on the top) then three vertical dot then edit and then pass your String arguments in the "Program Arguments" .
        // iterating over method (functions) parameter passed string
        for(String s:args) {
            System.out.print(s);
            System.out.print(" ");
        }

        // calling funtion
        System.out.println();
        System.out.println("hello ");
        int val = callMe(12,5);
        System.out.println(val);
        callMe(44);
    }
    // static means we don't need to create object to call the funciton
    // String [] args means it is an Array of name args
    public static int callMe(int a, int b) {
        System.out.println("I'm in callMe funtcion with two parameter.");
        return a+b;
    }
    // calling function  using signature (same name but different parameter)
    public static int callMe(int a) {
        System.out.println("I am one parameter function " + a);
        return 0;
    }
}
