//  as we know we cannot create the objects of abstract classes. because it is just rule or method name without
//  declaration. So we can do this -->

abstract class ABC {
    abstract void method_name_show();
    abstract void method_name_read(); // whenever any class extends this.They must, declare the
    // behavior of the method
}

public class AbstractWithAnonymous {
    public static void main(String[] args) {
        // New creating obj. This might seem to people who don't know that much. We are creating the object of
        // abstract class or might seem to you as well that you are creating the object of abstract but but but
        // the object is created of anonymous function. in the name of abstract class. as shown below.
        ABC obj = new ABC() {
            @Override
            void method_name_show() {
                System.out.println("method_name_show is printing");
            }
            @Override
            void method_name_read() {
                System.out.println("method_name_read is printing");
            }
        };      // this whole block of code is anonymous class. From line 16 to 24.
//        here from line 15 to 22. the declaration of abstract class is done (inside an anonymous class
//        (anonymous class not have a name) ). And here object is created automatically by javaC compiler of
//        this anonymous class in the name of ABC.
        obj.method_name_read();
        obj.method_name_show();

    }
}
