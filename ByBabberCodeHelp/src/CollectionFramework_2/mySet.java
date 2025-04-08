package CollectionFramework_2;

import java.util.*;

public class mySet {

    public static void main(String[] args) {

        Set<Integer> st = new HashSet<>();
//        now for SET data structure we have HashSet<>() , LinkedHashSet<>(); and   TreeSet<>(); we can use.
        // their functionalities are below
///     set does not stores the duplicate values and it does not preserve order of addition/inserting value
        st.add(10);
        st.add(21);
        st.add(21);
        st.add(10);
        System.out.println(st);
        System.out.println(st.size());  // added four values but it added only 2.

///  addAll(), removeAll(),remove(), Iterator() , clear(),contains() containsAll(), etc are there.


        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(4);
        set1.add(241);
        set1.add(67);

        set2.add(12);
        set2.add(2);
        set2.add(43);
        set2.add(241);
        set2.add(67);
        System.out.println("Set1 Values " + set1);
        System.out.println("Set2 values " + set2);
        // before retainAll
        set1.retainAll(set2);   // shows only common elements among them

        System.out.println("After retain " + set1);
        System.out.println(set1.containsAll(set2));// return boolean value if all value present then true else false. means it checks that set2 is subset of set1 or not


        Set<Integer> set3 = new LinkedHashSet<>();
///        LinkedHashSet<>() has one extra benefit- is preserve the order of inserting values means it keeps values just in the order of your insertion
        set3.add(121);
        set3.add(2112);
        set3.add(2141);
        set3.add(21241);
        set3.add(6217);

        System.out.println(set3);// see values are present in order of insertion

//        HashSet -> O(1)
//        LinkedHashSet -> O(n)
//        TreeSet<>() -> O(log n)

        Set<Integer> set4 = new TreeSet<>();
///        TreeSet<>() has one extra benefit - it always keep the values in sorted order
        set4.add(1221);
        set4.add(912);
        set4.add(29);
        set4.add(25);
        set4.add(577);

        System.out.println(set4);// see values are present sorted order



    }

}
