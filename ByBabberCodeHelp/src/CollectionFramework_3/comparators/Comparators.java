package CollectionFramework_3.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators {
    public static void main(String[] args) {

        List<Students> list = new ArrayList<>();

        list.add(new Students(80,"kitty", 89));;
        list.add(new Students(10,"Ramu",32));
        list.add(new Students(32,"alpha",32));

        System.out.println(list);

//        Collections.sort(list, new Comparator<Students>() {
//            @Override
//            public int compare(Students o1, Students o2) {
//                return o1.weight - o2.weight;
//            }
//        });

//        lamda expression
        Collections.sort(list,(o1,o2) -> o1.weight - o2.weight);
        
//        Collections.sort(list);
        
        System.out.println(list);


    }
}
