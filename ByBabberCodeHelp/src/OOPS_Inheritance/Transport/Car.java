package OOPS_Inheritance.Transport;

public class Car extends Vehicle {
    public int noOfDoors;
    public String transmissionType;

    // parameterised ctor
    Car (String name, String model, int noOfTyres , int noOfDoors, String transmissionType) {
        super(name, model, noOfTyres);  // here super() keyword is used to inherit the property of is its immediate parent class and it will call its (methods) ctor if it no values passed if we pass value then it automatically call the parameterised ctor and set the passed values.
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
//        super.start_engine();   //  super can be used to access the method/behavior of just immediate parent .
    }
    public void startAC () {
        System.out.println("AC started of "+ name );
    }

}




















