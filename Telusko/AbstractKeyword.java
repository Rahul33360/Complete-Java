abstract class Vehicle{
    public abstract void HasTyres();  /*  A abstract method can't be implemented in its own abstract class.
        A abstract class is use when you don't know how to implement the method, but you know any XYz(variable) method
        should be there or should be implemented by other.
    */
    public void colour(){       ///  A abstract class can have non-abstract methods.
        System.out.println("Red");
    }
/*
 if any method is made abstract,and it is inherited by any class (and the class is not abstract) then its implemented
    in that class (which we say as a concret class)
*/
}

// let's see example
abstract class newVehicle{
    public abstract void hasTyres();    // abstract method defined. Implementation not
    public abstract void doors();
    public void colour() {
        System.out.println("Blue"); // abstract class having not-abstract method
    }
}
abstract class Updated extends newVehicle {

    @Override
    public void hasTyres() {
        // here is the implementation
        System.out.println("4 Tyres");
    }
    ///  if we donot implement the doors (abstract method here). It will show error. Either we have to implement here or
    ///  or make this also the abstract class if we want it to implement in other class.
}
class ready extends Updated {   ///    now this is concrete class because it has implemented all the abstract method. not method is left to implement and also this not a abstract class also.

    public void doors() {
        System.out.println("4 Dorrs");
    }

}


public abstract class AbstractKeyword {
    public static void main(String[] args) {

//        newVehicle obj = new newVehicle(); // abstract class cannot be instantiated
        newVehicle obj = new ready();
        obj.hasTyres();
        obj.colour();
        obj.doors();
    }
}


/// A class which is if abstract. Its Object cannot be created.
