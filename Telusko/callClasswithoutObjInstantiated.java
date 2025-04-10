
class mobile {
    static {
        String disp = "Good";
        String Battery = "4000 mAh";
        System.out.println(disp + " " + Battery);
    }
}
public class callClasswithoutObjInstantiated {
    public static void main(String[] args) throws ClassNotFoundException {
/*       in here we got a concept which is -> A CLASS IS ONLY CREATED/CALL WHEN WE CREATE OBJECT OF THAT. and
            a static block of code is executed only once.
            read all these code for reference.
 */
//        let's run this code without object creation till here and see the output.
//        nothing will print on the output console. -> because until we create an object a class. it won't executed by jvm/compiler

//        now lets assign its object to a variable var of class mobile.
       /* mobile var = new mobile(); */     // now till here if we run the code it prints the static blocks. meaning class is instantiated. now the output

//        but if we don't want to assign obj. to any class. there is one inbuilt java property. check below
        Class.forName("mobile");    // now this inbuilt feature of java will run/instantiated the mobile class


    }
}
