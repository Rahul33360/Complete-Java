package OOPS_Inheritance.Org;

class techLead extends employee implements projectManager, teamLead {
    protected String projectManaged;
    protected int teamSize;

    public techLead(String name, int employeeId,String projectManaged, int teamSize ) {
        super(name, employeeId);
        this.projectManaged = projectManaged ;
        this.teamSize = teamSize;
    }
    public void displayInfo() {
        display();
        manageProject();
        leadteam();
    }

//    public void displayInfo() {
//        System.out.println("I am techLead " + name + "my Id is " + employeeId);
//    }

    public void manageProject() {
        System.out.println("project Managed response " + projectManaged);
    }
    public void leadteam() {
        System.out.println("Size of the team is " + teamSize);
    }

}
