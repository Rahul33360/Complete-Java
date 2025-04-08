package OOPS_Inheritance.Org;

public class executive extends employee {

    public executive(String name, int employeeId) {
        super(name,employeeId);
    }

    public void makeExeDecision () {
        System.out.println("I am make Execution Decision " + name + "my Id is " + employeeId);

    }

}
