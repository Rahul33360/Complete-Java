package OOPS_Encapsulation;

public class Student {
        public int id;
        public int age;
        public String name;
        public int nos;
        private String gfName;      //  private

        // getter
        public String gf_ka_name () {
            return gfName;
        }
        // setter (use for setting the values of private member or create a layer of authentication)
        public void gf_name_change (String gf_new_name) {
            if(gf_new_name.length() > 4) {  // we can set any type of rule because of this setter
                this.gfName = gf_new_name;
            }
            return;
        }
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
        private void gf() {
            System.out.println(gfName + "gfChating");
        }

        //  Parameterised ctor
        public Student(int id, int age, String name, int nos, String gf) {
            System.out.println("I am Inside Parameterised Constructor");
            this.id = id;
            this.name = name;
            this.age = age;
            this.nos = nos;
            this.gfName = gf;
        }

}
