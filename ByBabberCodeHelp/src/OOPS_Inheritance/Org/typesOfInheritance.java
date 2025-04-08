package OOPS_Inheritance.Org;


public class typesOfInheritance extends employee {
    public static void main(String[] args) {
        // single level
//        employee e = new employee("Rahul",11);
//        e.display();
        // multi level
//        HRDirector hrd = new HRDirector("Rahul",11);
//        hrd.manageHRDep();

///      multiple inheritance (not actually it lies in java but with some tricks it can be achieved
//        techLead t = new techLead("Rahul", 1,"Rahul", 3);
//        t.displayInfo();

//      multi-level
//        HRDirector hrd = new HRDirector("Lucy", 23302);
//        hrd.manageHRDep();

//      Hierarchical
//        CEO ceo = new CEO("Rahul Jacker",221);
//        ceo.leadCompany();

//      Hybrid
        businessDevelopmentManager BDM = new businessDevelopmentManager("Taski", 2342);
        BDM.cordinateBusinessDev();


    }
}
