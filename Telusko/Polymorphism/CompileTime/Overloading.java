package Polymorphism.CompileTime;

class add {
    public int addition (int a, int b) {
        return a+b;
    }

    public int addition (int a, int b, int c) {
        return a+b;
    }
}

public class Overloading {
    public static void main(String[] args) {
        add obj = new add();
        int val1 = obj.addition(1,2,3);
        System.out.println(val1);
        int val2 = obj.addition(1,3);
        System.out.println(val2);


    }
}
