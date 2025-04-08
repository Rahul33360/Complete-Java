package OOPS_Inheritance.Org;

public class developer extends employee{
    private String pro_language;

    // ctor
    public developer(){
        this.pro_language = "";
    }
    public developer(String name, int employeeId ,String pro_language) {
        super(name , employeeId);
        this.pro_language = pro_language;
    }

    public void show() {
        System.out.println("I am "+ name +"and my ID is" + employeeId + "do developement in " + pro_language + " language");
        System.out.println("I am sales Manager " + name + "my Id is " + employeeId);

    }

}
