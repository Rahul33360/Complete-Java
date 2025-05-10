//  97
// ForEach working and it's an implementation (and it is functional interface. so lambda expression will be there)


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEach_n_more {
    public static void main(String[] args) {
//        List<Integer> lst = new ArrayList<>();

        List<Integer> list  = Arrays.asList(3,2,14,5,6,11,42);  // through this we can add multiple values at a time.

//        list.forEach(a -> System.out.println(a)); // when you click on forEach while pressing ctrl. you see
        // it's taking "Consumer" type object. and when you do same for Consumer you find it is a FunctionalInterface.
    // In this we will understand how this works and behind the working of this forEach loop. So let's start
        // As i said forEach need Consumer type of object. (means Consumer may be class , interface or etc)
        Consumer<Integer> con = new Consumer<Integer>() {   // object creation of consumer interface.
            // And it is interfaced then it needed to be declared now with anonymous function
            @Override
            public void accept(Integer integer) {   // Anonymous class
                System.out.println(integer);
            }
        };
//        now let's pass the value in
        list.forEach(con);  // working perfectlly
//        now so it is FunctionalInterface so let's make it lamdaExpression

//        Consumer<Integer> con2 =integer -> System.out.println(integer);
//      so can we write it like this
//        list.forEach(con2);
        list.forEach(integer -> System.out.println(integer)); /// Instead of con2. just copy-pasted the R.H.S value

        // so this was the workingS

    }
}
