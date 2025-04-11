//  different uses of final keyword in variable, method and class

class CarModel {
    int tyre=4;
    String colour = "Red";
    int torque = 450;

    final public void MyDesign() {
        System.out.println("Designed by Rahul");
    }
}
// For final method
/*  suppose we try to extend the final from its parent class then what if , i change the MyDesign (author) name.
    To prevent it from changing the declared value or statements or methods we use this before method . Like shown below    */

class Design extends CarModel {
    // it will extend the type, colour, torque variables but it won't share the final methods to the child class
     Design (int changed_tyre_count) {
         this.tyre = changed_tyre_count;
     }
/*
    public void MyDesign() {    // this will show error. like we were trying in polymorphism to extend some parent property.
        System.out.println("Designed by john Wick");
    }       // by this way we can stop this extending.
    */
}

//      And now for final class
final class Bus {
    int tyre = 6;

    Bus(){   }      //   ctor
}

//class BigBus extends Bus {  //  this will show error when we extend  Bus. It won't allow to extend.
//    String colour = "BLue";
//}


public class finalKeyword {
    public static void main(String[] args) {
        final int var = 10;     // once value is assign to final variable it cannot be changed
//        var = 123;    // uncomment this . it will show error.
        System.out.println(var);
        CarModel obj = new CarModel();
        obj.MyDesign();

    }
}
