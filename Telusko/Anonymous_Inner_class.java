// An anonymous inner class is a class that is present inside a class but don't have the name.

class AB {
    public void show() {
        System.out.println("In a AB show");
    }
}

public class Anonymous_Inner_class {
    public static void main(String[] args) {
        // creating object
//        AB obj = new AB();
//        obj.show();

        // now we will create obj again, but we will create a new anonymous(having no name) class inside it.
        // and we will make a method with the same name which will override the parent show method.
/*
        AB obj = new AB(){};    // this curly bracket is used to create anonymous class, which overrides method
        obj.show();
*/
        AB obj1 = new AB() {
            @Override
            public void show() {
//                super.show();     // this will call the parent show method.
                System.out.println("Into an Anonymous Class");
            }
        };
        obj1.show();
    }
}
