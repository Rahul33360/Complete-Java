// see in java there are two types of data types
/*
    1. Primitive data types - int ,char,etc.
    2. Class(object based) (also known as wrapper class) - Integer,String,etc.
*/

//      so lets play with that

public class wrapperClasses {
    public static void main(String[] args) {
        int num = 9;    // directly stored the value
        // but if we want to store it using wrapper class.Below is the way
        Integer num1 = num; /// this is called auto-boxing. because it is auto automatically storing int value in Integer wrapper class.
        ///   deprecated  -- if you see this. it means the method/function you have used it may be removed in upcoming update.then the part of code won't work.
        System.out.println(num1);   // 9
//        we can do reverse also. fetching data from wrapper class
//        int num3 = num1.intValue(); // this is unboxing.
//        but for this we have an automatic process which will convert it into int value. and for that we say it /// auto-unboxing .see below
        int num3 = num1;    // this is auto-unboxing.
        System.out.println(num3);
        // let's play with Strings too
        String str = "121";
        int num4  = Integer.parseInt(str); // so something wrapper made our work easy
        System.out.println(num4);
        //  we can easily parse String to int.


    }
}
