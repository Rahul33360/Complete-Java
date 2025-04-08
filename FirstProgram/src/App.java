public class App {
    public static void main (String [] args) {
        // System.out.println("hello first");
        // System.out.print(28+1);
        // System.out.println( " Added value of 28 and 1");
        // System.out.println("to run Press F5 in keyboard");
        char ch='A';
        System.out.println(ch);
        System.out.println((int)ch);
        byte num = 3;
        System.out.println(num);
        float num2 = 2.123456789f;
        System.out.println(num2);
        double num3 = 3.1234567890123455;
        System.out.println(num3);


        int num_int = 10;
        float num_float = num_int;  // Implicitly converting integer to float
        System.out.println(num_float);
        
        byte b = 50;
        b = (byte)(b * 2);
        System.out.println(b); // Explicitly converting integer to float

        long number = 9223372036854775806L;
        System.out.println(number);
    } 



}
