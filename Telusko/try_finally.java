/*
    finally, keyword in Java is used to define a block of code that always runs,
    regardless of whether an exception was thrown or caught.
    Like we have catch block which runs only when exceptions occurs, but in finally block of code it will be executed in
    any case/scenario whether there is error onr not.
*/


public class try_finally {
    public static void main(String[] args) {
        int i=0;
        int j=10;
        try {
            j = j/i;    // this will throw error
            System.out.println(j);  // here it won't execute.
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Value of J in finally block : " + j);
            System.out.println("Any block of code present in finally block. It will run for sure!! ");
        }

    }
}
