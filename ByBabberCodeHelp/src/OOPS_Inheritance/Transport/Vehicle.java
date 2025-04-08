package OOPS_Inheritance.Transport;

public class Vehicle {
    // methods
     public String name;
     public String model;
     public int no_of_tyres;

     //  default ctor
     Vehicle() {
         this.name = "";
         this.model = "";
         this.no_of_tyres = -1;
     }
     // parameterised ctor
    Vehicle(String name, String model, int no_of_tyre) {
         this.name = name;
         this.model = model;
         this.no_of_tyres = no_of_tyre;     //  -----> see
    }
    // behaviour
    public void start_engine() {
        System.out.printf("Engine is starting of %s : %s \n", name, model);

    }
    public void stop_engine() {
        System.out.printf("Engine is stopping of %s : %s\n", name, model);
    }



}
