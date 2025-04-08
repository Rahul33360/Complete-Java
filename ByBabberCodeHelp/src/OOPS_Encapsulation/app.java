package OOPS_Encapsulation;

//import OOPS_Encapsulation.Student;

public class app {
 
    public static void main(String[] args) {
        // calling using parameterised ctor
        Student A = new Student(1,21, "ABC",11,"khushi");
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
////       System.out.println(A.gfName);
//        //  calling methods
//        A.Study();
//        A.Sleep();
//        A.bunk();
        System.out.println(A.gf_ka_name());     // now this gf name is private but we can use it using getter (extra layer of authentication)
        A.gf_name_change("Tina");   // chaning the value uisng (private gf_name) setter .
        System.out.println(A.gf_ka_name());     // it will print old name khushi
        // the above name Tina is not chaning because of the conditional statement. Let's try a new name more than 4 letters.
        A.gf_name_change("Kalyani");
        System.out.println(A.gf_ka_name());

    }
}
