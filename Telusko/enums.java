//   Enum behaves differently in java then c++. In here Enums are kind of Class and values inside them are object.

enum Status {       // this status in here is variable name of enum class
    Running, Failed, Pending, Sucess ;   // All these are the objects
}


public class enums {
    public static void main(String[] args) {
        Status s = Status.Running;     // this s is variable of type Status storing Running status from enum class.
        System.out.println(s);
        System.out.println(s.ordinal());    // return running index number
        Status s2 = Status.Pending;
        System.out.println(s2.ordinal());
//        for getting all the values from that enum class.
        Status[] st = Status.values();  // we storing it in st array.
//        printing using for each loop
//        for(Status ss : st) {   // iterating in the array where values stored
//            System.out.println(ss);
//        }
        for(Status ss : st) {   // iterating in the array where values stored with their order of it.
            System.out.println(ss +"  "+ ss.ordinal());
        }

//        s = Status.Pending;
//        s = Status.Failed;
        s = Status.Sucess;

        switch (s) {
            case Running :
                System.out.println("All system Running");
                break;
            case Failed:
                System.out.println("server Failed");
                break;
            case Pending:
                System.out.println("Request Pending");
                break;
            case Sucess:
                System.out.println("Done successfully");
                break;
            default:
                System.out.println("Internal Server Error");
                break;
        }


    }
}
