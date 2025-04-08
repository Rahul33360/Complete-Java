package OOPS_Abstraction;


/*

abstract class Bird {
    abstract void fly();
    abstract void eat();
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Birds can fly");
    }

    @Override
    void eat() {
        System.out.println("Birds do eats");
    }
}

class Crow extends Bird {
    void fly() {
        System.out.println("Crow can fly");
    }
    void eat() {
        System.out.println("Crow do eats");
    }
}


public class main {
    public static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
    }

    public static void main(String[] args) {
//        Bird b = new Sparrow();
//        b.eat();
//        b.fly();
//        b = new Crow();
//        b.fly();
//        b.eat();

        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());


    }
}

*/




///  we use "interface"  in place of abstraction

interface Bird{
    void fly();

    void eat();

}

class Sparrow implements Bird {
    @Override
    public void fly() {
        System.out.println("Birds can fly");
    }

    @Override
    public void eat() {
        System.out.println("Birds do eats");
    }
}

class Crow implements Bird {
    public void fly() {
        System.out.println("Crow can fly");
    }
    public void eat() {
        System.out.println("Crow do eats");
    }
}


public class main {
    public static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
    }

    public static void main(String[] args) {
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());


    }
}
