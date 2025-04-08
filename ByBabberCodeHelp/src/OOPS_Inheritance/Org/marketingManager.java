package OOPS_Inheritance.Org;

//public class marketingManager extends employee{
//
//    public marketingManager(String name, int employeeId) {
//        super(name,employeeId);
//    }
//
//    public void createMarketingStrategy() {
//        System.out.println("I am marketing Manager " + name + "my Id is " + employeeId);
//
//    }
//}
    interface marketingManager {
        default void createMarketingStrategy() {/* NO BODY */}
}

