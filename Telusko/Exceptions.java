    /*
    Exception handling in Java allows developers to manage runtime errors effectively by using mechanisms like
    try-catch block, finally block, throwing Exceptions, Custom Exception handling, etc.

    Error can be of 3 types - 1) at compile Time, 2) at RunTime, 3) Logical error
    And here is we do 'Exception Handling' for RunTime errors.
*/

public class Exceptions {
    public static void main(String[] args) {
        int i = 2;
        int j = 12;
//        this is the we handel any error or exceptions. First code will be executed in try block and if it got any error
//        it will move to catch block and run that block of code.
/// we use try catch for many purpose but in here to continue(last two s.out statements) it's execution even if it throws exception.
        try{
            j = 12/i;
        } catch (Exception e) {     // if there doesn't happen any error, this block of code completely skipped.
            System.out.println("Exception hit. Something Wrong " +e);
        }
        System.out.println("j = " + j);
        System.out.println("try catch ends here");


    }
}
