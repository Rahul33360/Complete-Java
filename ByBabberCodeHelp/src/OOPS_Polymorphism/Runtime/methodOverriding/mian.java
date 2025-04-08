package OOPS_Polymorphism.Runtime.methodOverriding;

public class mian {
    public static void main(String[] args) {
        Circle cir = new Circle();
//        cir.draw();

        // now after adding draw method in circle class. from now on whenever we call spe.draw() it overrides the shape draw() method. SEE BELOW
        cir.draw();

        shapes sh = new shapes();
        sh.draw();

    }
}
