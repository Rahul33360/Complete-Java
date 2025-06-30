
class A_hide {
    static void display() {
        System.out.println("Inside A");
    }
}
class B_hide extends A_hide {
    static void display() {
        System.out.println("Inside B");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
//        A_hide ah = new A_hide();
//        ah.display();
//        B_hide ah = new B_hide();
//        ah.display();
//        A_hide.display();
//        B_hide.display();

    }
}
