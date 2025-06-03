
class anonymous {
    public void anonymous () {
        System.out.println("anonymous called");
    }
}

public class anonymousObj {
    public static void main(String[] args) {
//      an anonymus object is a object which don't have name or let's say it is not assigned to any variable name.
        new anonymous(); // like here we create the objcet. we cannot use it multiple times bcuz we did not store it.

        new anonymous().anonymous(); // to access the anonymous() method need to call it again but in heap it is created again




    }
}
