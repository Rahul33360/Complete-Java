package OOPS_Inheritance.Org;

public class salesManager extends employee{

    public salesManager(String name, int employeeId) {
        super(name,employeeId);
    }

    public void boostSales()  {
        System.out.println("I am sales Manager " + name + "my Id is " + employeeId);
    }
}

