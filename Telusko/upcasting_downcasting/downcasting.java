package upcasting_downcasting;


class Animal {
    public void eat() {
        System.out.println("Animal - eat");
    }
}
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("dog eat");
    }
    public void bark() {
        System.out.println("Dog bark");
    }
    public static void check() {
        System.out.println("Dog's check running");
    }
}
class BabyDog extends Dog {
    @Override
    public void eat() {
        System.out.println("BabyDog eats");
    }
    @Override
    public void bark() {
        System.out.println("BabyDog bark");
    }
    public void weep() {
        System.out.println("BabyDog weep");
    }
}


public class downcasting {
    public static void main(String[] args) {
        Animal a = new Dog();   // upcating Dog to Animal
        a.eat();
//        a.bark(); //C.T.E
        Dog d = (Dog) a;    /// DownCasting animal to dog
        d.eat();
        d.bark();
//        d.weep();     // C.T.E
        a = new BabyDog();  // upcasting BabyDog to animal
        a.eat();
        BabyDog b = (BabyDog) a;    // downcasting animal to BabyDog
        b.eat();
        b.bark();
        b.weep();

///  Here is the tricky part
        a = new BabyDog();
        Dog d2 = (Dog) a;
        d2.eat();   //  BabyDog eats
        d2.bark();   // BabyDog bark
        // Thinking Why?
/**
 * Because methods are non-static. So non-static methods are called on the basis of instance Type (obj type)
 * and its instance is of type BabyDog. So that's why it invokes BabyDog methods. but we can't access weep() method
*/
//        let's try with some Static Methods
          d2.check();   //  Dog's check running
        /// above !. it is static. so it's running the Dog method.

    }
}
