package OOPS_Inheritance.Org;

public class businessDevelopmentManager extends salesManager implements marketingManager {

    public businessDevelopmentManager(String name, int employeeId) {
        super(name, employeeId);
    }



    public void cordinateBusinessDev () {
        createMarketingStrategy();
        boostSales();
        System.out.println("I am business Development Manager " + name + "my Id is " + employeeId);
    }

    public void createMarketingStrategy() {
        System.out.println("I am marketing Manager " + name + " my Id is " + employeeId);
    }

}