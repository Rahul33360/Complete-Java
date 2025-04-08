package OOPS_Inheritance.Org;

public class CEO extends executive{

    public CEO(String name, int employeeId ) {
        super(name,employeeId);
    }

    public void leadCompany() {
        System.out.println("I am CEO " + name + "my Id is " + employeeId);
    }

}
