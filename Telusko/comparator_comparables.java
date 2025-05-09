/*
     In Java, both Comparable and Comparator interfaces are used for sorting objects. The main difference between
     Comparable and Comparator is:
     Comparable:
        Implemented by the class whose objects need to be sorted.
        Provides a natural ordering for objects of that class.
        Contains a single method, compareTo(), which compares the current object with another object of the same type.
     CompareTo() method returns:
        A negative integer if the current object is less than the other object.
        Zero if the current object is equal to the other object.
        A positive integer if the current object is greater than the other object.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//    import java.util.*;   // this includes all the packages or libraries.


class Students {
    int age;
    String name;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


class NewStudents implements Comparable<NewStudents> {     // this is comparable. becuz we implement it here in class.
    int age;
    String name;

    public NewStudents(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(NewStudents that) {   // sorting logic is defined. in this comparable
        if(this.age > that.age)
            return 1;
        else return -1;
    }
}


public class comparator_comparables {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(36);
        list.add(14);
        list.add(53);
        list.add(23);

//        Collections.sort(list);
//        System.out.println(list);
//        so if we want to change the sorting pattern of String or lets say Integer. we need to use comparator.
//        if you check the Comparator by ctrl presseing and clicking through on it using mouse . You find it is a
//        @Functional interface. and a functional interface can have only one method signature as we know this.
/**          ✅ Lambda expressions can only be used with functional interfaces.
             ❌ But functional interfaces are not used only in lambda expressions.
       Functional interfaces can also be used with:
            1. Anonymous inner classes
            2. Method references
            3. Regular class implementations
        **/
//      so it is an interface so maybe we can re-write or override the inbuilt code. so for that lets say we, do this
//      (But we use lambda expression just for anonymous class creation purpose). so lets create
//      and then we modify the sorting pattern

//      we are sorting the num values on the basis of their second value (means let's say 36. so its first value is 3,
//      and the second value is 3) in ascending order. like 13,36,14,53,26

/*          Comparator<Integer> comm = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
///         if you return 1 it will swap if -1 no swaps. Logic of sorting will be here.
                if(o1.intValue() % 10 > o2.intValue() % 10)
                    return 1;   // means if second num is small then swap it.
                else
                    return -1;
            }
        };

        Collections.sort(list,comm);
        System.out.println(list);   // see the output [12, 23, 53, 14, 36]. sorted on basis on second num.
*/
//      now let's convert this now into lambda Expression
//      Comparator<Integer> comm =(o1,o2)-> {return o1 % 10 > o2 % 10 ? 1 : -1; }; // it also works
       Comparator<Integer> comm =(o1,o2)-> o1.intValue() % 10 > o2.intValue() % 10 ? 1 : -1;
       // we dont need to write return also if it is in one line.
/*
        Collections.sort(list,comm);
        System.out.println(list);   // see the output [12, 23, 53, 14, 36]. sorted on basis on second num.
*/

//        now lets create a Array of String and then sort it, based on String size (ascending order)
        List<String > str = new ArrayList<>();
        str.add("Rahul");
        str.add("John Snow");
        str.add("Ned Stark");
        str.add("Robert Pattision");
        str.add("Tata Jagur");
/*

        Comparator<String> strComm = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length())
                    return 1;
                else return -1;
            }
        };
*/
//      lambda expression for above expression is below one
        Comparator<String> strComm = (o1,o2) -> o1.length() > o2.length() ? 1 : -1;// lamda expr..

/*
        Collections.sort(str, strComm);
        System.out.println(str);
*/

//        for(String i:str)
//            System.out.println(i.length());


        // now let's sort a class Student who have some name as (string) and age or roll take anyone. and
        // will sort using age using comparator

        List<Students> stud = new ArrayList<>();
        stud.add(new Students("Raj Pratik", 21));
        stud.add(new Students("Raj Sam", 24));
        stud.add(new Students("Daniel Radcliffe", 31));
        stud.add(new Students("Robert Junior", 27));
        stud.add(new Students("John Snow", 34));
        stud.add(new Students("Ned Stark", 25));
/*
        Comparator<Students> studComm = new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                if(o1.age > o2.age)
                    return 1;
                else return -1;
            }
        };
*/      //  lamda expression for this one is
        Comparator<Students> studComm = (o1 ,o2) -> o1.age > o2.age ? 1 : -1;

        Collections.sort(stud,studComm);
        for(Students i:stud)
            System.out.println(i);  // You can see it is sorted on age basis of students


///     comparable from here

        System.out.println("Comparable here");
        List<NewStudents> list2 = new ArrayList<>();
        list2.add(new NewStudents("Alice", 22));
        list2.add(new NewStudents("Bob", 19));
        list2.add(new NewStudents("Charlie", 25));
        Collections.sort(list2);  // now  this will Uses compareTo() method from the class.

        for(NewStudents i:list2)
            System.out.println(i);


        // now using comparable, we have created a compare method inside the NewStudent. Which will
        // sort on basis on age in ascending order. This is called as comparable because it is created inside
        // the class and it is redefined by us. so this is the diff between comparable and comparator.

    }
}
