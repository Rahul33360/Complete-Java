package Polymorphism.RunTime;
// here we'll se how to achieve Method Overriding (runtime)

class car {
    public void Red() {
        System.out.println("I am in Red car model");
    }
}
class Bus extends car {
    public void Red () {
        System.out.println("I am inside taxi");
    }
}

public class overriding_DynamicDispatch {
    public static void main(String[] args) {
        // now when we create here our object. see which one Red method will be invoked
        Bus obj = new Bus();
        obj.Red();    //  output->  I am inside taxi.  this is because, child class overrides the methods of parent class.
//        let's play with the object.   you know na->  right side of the equal_to (=) is our object. " new Bus() "
//        what happen if we change the object. if we create car object. Let's see what happens

        car obj1 = new Bus();  /*  we can reference parent (car) to refer to a child object (Bus). (obj1 (variable of type Car) is referenced to child object Bus)  — totally valid.
                this is called as UPCASTING. it is valid and we can do this.
                but think reverse of it. Like- Bus obj1 = new car(); this is DOWN CASTING. and this is not allowed. to do
                this we have to do it forcefully.

        so if we do this -  car obj1 = new Bus(); - Then our output will be changed. let's see    */
        obj1.Red();  /*   output is this ->   I am inside taxi.   Why this is? This is because we are still
        referencing/storing the value of new Bus() in parent class.
               */
    }
}

/*  ------------------  SOME IMPORTANT POINTS FOR DYNAMIC DISPATCH -------------------------------
        Dynamic dispatch gives value at runtime.
        Method overriding is just the tool to define different behavior.
        Without dynamic dispatch, method overriding would be static and useless for polymorphism.
        1. Overriding is what you write. It's just defining the same method in child and parent classes.
        2. Dynamic dispatch is what Java does at runtime. Java uses dynamic dispatch to decide:
            "Ah! The actual object is a Bus, so run the Bus version."
            This decision at runtime is called dynamic dispatch.

 In short (for interview):   “Method overriding is a compile-time feature that lets child classes define their own method.
                            Dynamic dispatch is the runtime mechanism that makes sure the correct overridden
                            method runs based on the actual object — not just the reference.”

____________________________________________________________________________________________________________
|       Term	             |            Role                                                             |
|   Overriding	             |     Writing different versions of the same method in child and parent           |
|   Dynamic dispatch	     |     The mechanism Java uses at runtime to choose the correct method             |
------------------------------------------------------------------------------------------------------------

*/
