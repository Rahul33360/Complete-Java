package constructors;

public class Students {

    public int id;
    public int age;
    public String name;
    public int nos;
    // default constructor
//    public Students (){
//        System.out.println("Default ctor Studdent.");
//    }
//      METHODS / BEHAVIOUR
    public void bunk() {
        System.out.println(name + " Bunking");
    }
    public void Study() {
        System.out.println(name + " Studying");
    }
    public void Sleep() {
        System.out.println(name + " Sleeping");
    }
    public void read() {System.out.println(name+ "reading book");}
    //  Parameterised ctor
    public Students(int id, int age, String name, int nos) {
        System.out.println("I am Inside Parameterised Constructor");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
    }
    //  copy ctor
    public Students (Students obj) {
        System.out.println("I am Inside Copy Constructor");
        this.id = obj.id;
        this.name = obj.name;
        this.age = obj.age;
        this.nos =obj. nos;
    }
}
