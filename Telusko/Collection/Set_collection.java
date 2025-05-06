package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_collection {
    public static void main(String[] args) {
//        Set<Integer> st = new HashSet<>();  /// it stores value - unique only and unsorted order.
//        st.add(21);
//        st.add(76);
//        st.add(65);
//        st.add(21);
//        st.add(48);
//        for (int i:st)
//            System.out.println(i);  // as you can see values not in sorted order and not in sequence as we stored.

        // A TreeSet store values in sorted order and off-course unique too
        Set<Integer> tr = new TreeSet<>();  /// it stores value - unique only and sorted order.
        tr.add(21);
        tr.add(76);
        tr.add(65);
        tr.add(21);
        tr.add(48);
//        for (int i:tr)
//            System.out.println(i);


        //  Iterator -  how to use that lets see. It is simple
        Iterator<Integer> itr = tr.iterator();
///        if we don't know the size   - has.next(); -- it return true till the set having the values.
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }






    }
}
