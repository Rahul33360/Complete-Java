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

public class instanceOf {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);
        System.out.println("--------------------------");
        a = new Dog();
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);
        System.out.println(a instanceof BabyDog);

        System.out.println("--------------------------");
        a = new BabyDog();
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);
        System.out.println(a instanceof BabyDog);




    }
}
