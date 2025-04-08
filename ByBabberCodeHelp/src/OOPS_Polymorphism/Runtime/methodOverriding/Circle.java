package OOPS_Polymorphism.Runtime.methodOverriding;

public class Circle extends shapes {

   // this method overides the draw method of shapes class (parents class). it is not necessary to write @Override but if we write it is gud practice (u know!) .
//    @Override
    void draw() {
        System.out.println("circle is drawing");
    }


}
