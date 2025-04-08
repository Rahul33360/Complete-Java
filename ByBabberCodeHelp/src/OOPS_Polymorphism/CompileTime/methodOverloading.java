package OOPS_Polymorphism.CompileTime;

///    compile time is of two types -
///     Method Overloading
///      Operator Overloading    -- but  Java doesn't allow user defined operator overloading because if you allow programmer to do operator overloading they will come up with multiple meanings for same operator which will make the learning curve of any developer hard and things more confusing and messing. Thats why Java does not have operator overloading



// this below is method Overloading because look closely method/function have same name but diff arguments and diff number of arguments
public class methodOverloading {
    int add(int a, int b) {
        return a+b;
    }

    int add(int a, double b) {
        return (int) (a+b);
    }

    int add (int a, int b, int c) {
        return a+b+c;
    }

}

