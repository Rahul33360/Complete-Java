package OOPS_Inheritance.Org;

public class HRDirector extends HRManager{
    public HRDirector(String name, int employeeId) {
        super(name, employeeId);
    }
    public void manageHRDep() {
        System.out.println("I am HRDirector " + name + " my Id is " + employeeId);

    }
}
