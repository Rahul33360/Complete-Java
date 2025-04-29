//   It is similar like of abstract but a bit of different.
//  Abstract -> Can have both abstract (methods without implementation) and concrete (methods with implementation) methods.
//  Supports single inheritance, meaning a class can only inherit from one abstract class.
//  Can contain instance variables with all possible access modifiers.
                                        //  VS
//  Interface -> Implementation: Can only have abstract methods (no concrete methods are allowed inside it).
//  Inheritance: Supports multiple inheritance, meaning a class can implement multiple interfaces.
//  Can only have public, static, and final variables.
//  an interface is public, final, Static and abstract always (by default).


interface Car {
    void show();
    void config();
//    String name1; // this will show error because we haven't assigned value to this.
//    In interface, a variable must be initialized with a value. Because by default all values are final and static variable.
    String name = "BMW";
    int tyres = 4;
}

class newCar implements Car {       // imp- if this class fails to implement all the methods then it will automatically become an abstract class.

    public void show() {
        System.out.println("in a show method");
    }
    public void config() {
        System.out.println("in a config method");
    }
}

public class Intro_to_interface {
    public static void main(String[] args) {
//    Car obj;    // we can create reference of interface.Here, obj is a variable of type Car interface.
        // But we cannot instantiate it (or cannot create an object of it).
//        obj = new Car();      // here we have error. cannot instantiate it
        // we can use variables tough

        // so for use them we need to create a concrete class, and then we need to implement all the methods using
        // implement keyword.

        // now obj creation of newCar class
        Car obj = new newCar();     // reference is of interface but the instance is of class
        obj.show();
        System.out.println(newCar.tyres);   // we can access bcuze it is static variable by default in interface
        System.out.println(obj.tyres);       // we can access bcuze it is static variable by default in interface
        System.out.println(newCar.name);   // we can access bcuze it is static variable by default in interface
        System.out.println(obj.name);       // we can access bcuze it is static variable by default in interface

//        see no where I have mentioned the final keyword in interface to the variable. but they are by default final
//        let's try to change them. i know not possible to change the final variable but still. to verify it.
//        whether they are final by default or not.
        newCar.name = "My Car"; // error. it says -> Cannot assign a value to final variable 'name

    }
}

///     imp -->  for abstract we use extends but for interface we use implements