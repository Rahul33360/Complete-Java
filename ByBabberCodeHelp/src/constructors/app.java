package constructors;
//package OOPS_In_Java_constructor;

// to linked with Students either use the below import or use package above one
import constructors.Students;

public class app {
    public static void main(String[] args) {
//        setting and calling values using default ctor
//        Students A = new Students();
//        A.name = "Rahul";
//        A.age = 21;
//        A.id = 1;
//        A.nos = 11;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//        //  calling methods
//        A.Study();
//        A.Sleep();
//        A.bunk();


        // calling using parameterised ctor
        Students B = new Students(1,21,"Rahul",11);
//        System.out.println(B.id);
//        System.out.println(B.name);
//        System.out.println(B.age);
//        System.out.println(B.nos);
//        B.Study();

        // creating copy constructor and calling
        Students C = new Students(B);   // send B as a object because, it object is create at line 25
        System.out.println(C.id);
        System.out.println(C.name);
        System.out.println(C.age);
        System.out.println(C.nos);
        C.Study();

    }
}
