package OOPS_Inheritance.Org;

public class employee {
    protected String name;
    protected int employeeId;

    // default ctor
    public employee() {
        this.name = "";
        this.employeeId = -1;
    }
    // para... ctor
    public employee (String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void display() {
        System.out.println("I am  " + name + " and my Id is " +employeeId);
    }

}
