package Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ListArrayList {
    public static void main(String[] args) {
//        Collection arr = new ArrayList(); // Collection here is class arr is object so we are storing obj.
//        arr.add(8);
//        arr.add(85);
//        arr.add("Rahul");
//        for (Object i:arr) {  // iterating over object
//            System.out.println(i);
//        }

        Collection<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(8);
        arr1.add(85);
//        arr1.add("Rahul");    // this will show error.because new we specified we want to store only Integer type values
//        System.out.println(arr1);
//        for (Object i:arr1) {  // iterating over object
//            int val = (Integer) i;
//            System.out.println(i);
//       }

        // best to use List other than Collection for Array. Because it provides a lot of features.
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(28);
        arr2.add(134);
        arr2.add(25);
        System.out.println(arr2.indexOf(25));   // return the index of element present in arr. if not -1.

    }
}
