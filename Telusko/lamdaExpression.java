//  This symbol inside quotation marks is called as lambda expression " -> "
//  we use "default" or "static" for any extra methods when we
//  want to define in a functional interface.
/// In interface method are by default abstract.
///  And variables are by default public, static and final

@FunctionalInterface  // It's an interface that can contains only one abstract method.
interface A1 {
    void display();   /// In interface method are by default abstract
}

@FunctionalInterface
interface A2 {
//    void show(int i);    // take one parameter we can write as many as we want.
    void strShow(int num, String s);
}

public class lamdaExpression {
    public static void main(String[] args) {
//        A1 obj = new A1()
//        {       //  Anonymous class
//            public void display() {
//                System.out.println("This type of declaration called an anonymous class");
//            }
//        };

/*
    A lambda expression in Java provides a compact way to represent an anonymous function, which is a
    function without a name. They are particularly useful for concisely implementing functional interfaces,
    which are interfaces with a single abstract method.
*/
//      Lambda allows you to write clear and concise code. Internally compiler will replace this -> with the
//      actual way of writing code (which is A1 obj = new A1() {method and their body};
        A1 obj = () -> System.out.println("this is example of Lambda Expression");  // Lambda Expression
        obj.display();

//        we can pass the value too. for that lets create another interface and all those code required
//        A2 obj2 = (a) -> { //  like this one here 'int a'.we can skip writing "int".if same type of value
//            System.out.println("inside A2 anonymous class. And i'm holding " + a + " value");
//        };
//        obj2.show(34);

        // we can do this too
        A2 obj2 = (a,b) -> { // like this one here 'int a'.we can skip writing int.
            System.out.println("inside A2 anonymous class. And i'm holding " + a + " " + b +" my name");
        };
        obj2.strShow(34,"Rahul");

        








    }
}
