    /*
    Exception handling in Java allows developers to manage runtime errors effectively by using mechanisms like
    try-catch block, finally block, throwing Exceptions, Custom Exception handling, etc.

    Error can be of 3 types - 1) at compile Time, 2) at RunTime, 3) Logical error
    And here is we do 'Exception Handling' for RunTime errors.
*/

public class Exceptions {
    public static void main(String[] args) {
/*      int i = 0;
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
*/

        // some more with try and catch
        //  There are a lots of ways (of exception handling) in specific ways.Like AirthmethicExcetption, ArrayOutOfBOund,
        //  NullPointerException , etc. All these are child Classes of Exception (e), parent class. So if we using
        //  a lots of Exceptions (Like these Like AirthmethicExcetption, ArrayOutOfBOund ...) , then in that case the
        //  " Excetption " always will be written in the last (if it is written).
        ///  A point where a block of code will get Excetption, it stops the execution at that
        ///  point and move to catch block without executing the next line of the try block.

/*        int i = 0;
        int j = 12;

        try{
            j = 12/i;
            System.out.println("Execution Stopped if previous line gets Excetption. And this line won't be printed");
            // You can run this block and check the above statement won't get printed.
        }
        catch (Exception e) {     // if there doesn't happen any error, this block of code completely skipped.
            System.out.println("Exception hit. Something Wrong " +e);
        }
        System.out.println("j = " + j);
        System.out.println("try catch ends here");
*/
        //  let's see different types of Excetptionsss 😀 .
        int i = 0;
        int j = 12;
        String null_Str = null;
        int []arr = new int[5];
        try{    // the first Exception only will be executed rest stopped.
//            j = 12/i;  //if at this point it throws Excetption. Execution stops here.will move to Arithmetic Excetption block.
//            System.out.println(null_Str.length());  // if this throws Excetption.NullPointerException this will be executed.
            System.out.println("Accesing Null Value from Array" + arr[5]);  // at 5 null value is there.
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out Of bound" + e);
        }
        catch (NullPointerException n) {
            System.out.println("Null Value" + n);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Error" + e);
        }
        catch (Exception e) {     // if there doesn't happen any error, this block of code completely skipped.
            System.out.println("Exception hit. Something Wrong " +e);
        }   // this catch block will be executed when none of the above Exception match with anyone. To understand
        // it, You can think like it is default case. It will catch when no one will. Just like we have we "Switch" case
        // where there are some cases and we make a default case if none of the mentioned cases match it will
        // execute the default part code block.
        

        System.out.println("j = " + j);
        System.out.println("try catch ends here");



    }
}
