package OOPS_Polymorphism.CompileTime;

public class main {
    public static void main(String[] args) {
        methodOverloading MO = new methodOverloading();
        System.out.println(MO.add(1,2));
        System.out.println(MO.add(2,42.34));
        System.out.println(MO.add(24,56,123));
    }
}
