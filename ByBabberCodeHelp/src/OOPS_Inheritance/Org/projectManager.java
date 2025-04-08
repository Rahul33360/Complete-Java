package OOPS_Inheritance.Org;

interface projectManager {
//    protected String projectManaged;
//for multiple inheritance example (this interface for it). This method is declared in its child class. Java does not support multiple inheritance. thats why we use interfaces
// Java uses interfaces to implement multiple inheritances in order to prevent these conflicts.

/// an interface having METHOD does NOT have BODY .
// method
default void manageProject() { /* NO BODY */ }

//    public projectManager(String projectManaged) {
//        this.projectManaged = projectManaged;
//    }

//    public void manageProject(String projectManaged) {
//        System.out.println("project Managed response " + projectManaged);
//    }

}
