
class A {
    public void show() {
        System.out.println("I am inside A");
    }
}
class B extends A {
    public void show1() {
        System.out.println("Inside B");
    }
}

public class up_down_casting {
    public static void main(String[] args) {
        double num = 34.35;
        int number = (int) num;     //    this is down_casting of primitive types. whenever we down_casting we need to explicitly mention its type.
  /*    You're going from a larger type (double) to a smaller type (int).
        You lose data (decimal part), so Java needs explicit casting.
        */
        // Upcasting below
        int value = 23;
        double val = value;     //  this is up_casting of primitive types.

/*        similarly lets play with up/down casting with classes                   */
        A obj = (A) new B();    //   this is upcasting or specifically Dynamic Dispatch.
        /*  It is not necessary to mention when we up casting (A)     */
        obj.show();
//        obj.show1();    this will show error because child methods doesn't inherited by parent.
        /*        but if we have to down casting it      */
        B obj1 = (B) obj;       // this is down casting
        ((B) obj).show1();      // now this will work

    }

}
