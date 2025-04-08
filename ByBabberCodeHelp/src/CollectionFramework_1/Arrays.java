package CollectionFramework_1;

 import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        //List or Collection -> are interface

        ArrayList<Integer> arr = new ArrayList<>(); // if we use vector in place of new ArrayList. then all these functionalities are same
//      similarly all the lies in new Stack<>(); too. ye sab functionalities to kaam karenge gi stack me (agar List type use kar rahe hai to) lekin agar left part  me  Stack<Integer> st = new Stack<>();  stack type ke reference/functionalities use karenge to aome more featuure/methods we can use like-> st.push(), st.pop(), st.empty(),st.peek(),st.search(). these will be extra


//        List<Integer> list = new ArrayList<>();
//        Collection<Integer> collection = new ArrayList<>();

/**       List<Integer> (on the left): Defines what you can do (e.g., call methods like add(), remove(), addAll()).
        Acts like a blueprint (interface) that enforces certain behaviors.
        It doesn't care how the list works internally.
        new ArrayList<>() or new LinkedList<>() (on the right):
        Defines how it works internally (array-based or linked list-based). ArrayList: Uses an array internally (efficient for random access).
        LinkedList: Uses a linked list internally (efficient for insertions/deletions).
        list: Is just a variable name that refers to the object.
**/

        // to insert/add elements in the array
//        arr.add(10);
//        arr.add(12);
//        arr.add(12);
//        arr.add(12);
//        arr.add(214);
//        arr.add(123);
//        arr.add(421);
//
//        System.out.println(arr.size());
//        System.out.println(arr);
////        arr.clear();  // it will clear the array
//
//        arr.remove(6);
//        System.out.println(arr);
//
//        ArrayList<Integer> array = new ArrayList<>();
//        array.add(12);
//        array.add(211);
//        System.out.println(array);
//        // adding all elements from one array collection to another collection
//        arr.addAll(array);
//        System.out.println(arr);
//        arr.removeAll(array);
//        System.out.println(arr); // removeAll-it will remove all counts of specific number
//
//        // iterator - traversing on list/array/linkedlist
//        Iterator<Integer> itr = arr.iterator();// this way we create iterator on any array
//
////        System.out.println(itr.hasNext());
/////       itr.hasNext() - return true if the array has next element present from the point it is standind in the array
//        System.out.println();
//        while(itr.hasNext()) {  // so it will run till the array end element
//            System.out.println("Element -> "+itr.next());
//        }

//       now lets create LIST type collection . where some more functionalities we can use
//        List<Integer> list = new ArrayList<>();
//        list.add(12);
//        list.add(122);
//        list.add(324);
//        System.out.println(list.get(1)); // get - fetch index value
//
//        System.out.println("Before setting the  List " + list);
//        // changing the value at index in the list
//        list.set(0,111);
//        System.out.println("After setting the value " + list);
//
//        System.out.println(list.contains(111)); // is value present-> true of false
//
//        // to convert into any collection into array
//        Object[] arrray3 = list.toArray();
//        for(Object obj:list) {
//            System.out.println(obj);
//        }

////      this is Object type reference -> it can store all type of values
//        List<Object> list1 = new ArrayList<>();
//        list1.add("Rahul");
//        list1.add(1);
//        list1.add(2212.112);
//
////        this object can store any type of value
//        Object[] list3 = list1.toArray(); // Converts list to Object array
//
//        for (Object obj : list3) {
//            System.out.println(obj); // Prints each element
//        }
//
//

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(33);
        list4.add(34);
        list4.add(13);
        list4.add(32);
        list4.add(54);

        System.out.println(list4.isEmpty());
        System.out.println(list4.indexOf(13));  // if value present index or -1 if not present

        System.out.println("Before Sorting : " + list4);
        Collections.sort(list4);    // Ascending order sorting
        System.out.println("After Sort : " + list4);
        Collections.sort(list4,Collections.reverseOrder()); // reverse sort
        System.out.println("Reverse sort : " +list4);

        // clone the list
        ArrayList<Integer> newList = (ArrayList<Integer>)list4.clone();

        System.out.println(newList);

        ArrayList<Integer> marks = new ArrayList<>();
//        declearing the size/capacity of the array
        marks.ensureCapacity(100);

        Stack<Integer> st = new Stack<>();
        st.push(234);
        st.push(234);
        st.push(212);
        System.out.println("Stack Elements "+st);
        System.out.println(st.peek());  ///   LIFO - LAST IN FIRST OUT
        System.out.println(st.empty());
        System.out.println(!st.empty());
        System.out.println(st.search(234)); // 1 based indexing
        System.out.println(st.pop());

    }

}
