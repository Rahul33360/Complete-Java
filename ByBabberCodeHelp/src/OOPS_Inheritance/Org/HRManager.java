package OOPS_Inheritance.Org;

public class HRManager extends employee {
    public HRManager(String name, int employeeId) {
        super(name, employeeId);
    }

    public void handelHrDuties() {
        System.out.println("I am HRManager " + name + "my Id is " + employeeId);
    }
}
