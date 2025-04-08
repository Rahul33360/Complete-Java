package CollectionFramework_1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linked_list {
    public static <list> void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(21);
        list.add(232);
        list.add(43);
        list.add(12);

        System.out.println(list);
        System.out.println(list.contains(12));
        System.out.println("Before removing : " + list.remove(4));
        System.out.println("After removing : " + list);
        System.out.println(list.size());

        List<Integer> newList = new LinkedList<>();
        newList.add(12);
        newList.add(23);
        newList.add(31);

        // adding  newList in list;
        System.out.println("Before Adding : " +list);
        list.addAll(newList);
        System.out.println("After adding : " + list);
        System.out.println("Element at index 3 : " + list.get(3));

  //    iterator - traversing on list/array/linkedlist
      Iterator<Integer> itr = list.iterator();// this way we create iterator on any list/array/linkedlist

        while(itr.hasNext()) {
            System.out.print( itr.next() + " " );
        }
//        to remove all the values from a collection newList and the duplicate present in it
        System.out.println();
        list.removeAll(newList);
        System.out.println(list);
        list.set(2,12345);  // value changed at index at 2
        System.out.println(list);

        System.out.println(newList.isEmpty());
        System.out.println(newList);
        System.out.println(newList.indexOf(11)); // return the index of the integer if present
        System.out.println(newList.indexOf(31));
        newList.add(31);
        newList.add(31);
        System.out.println(newList);
        System.out.println(newList.lastIndexOf(31)); // return the last index of the number

        // addFirst and addLast
//        some linked List inbuilt methods
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(22);
        list2.addFirst(1);  // it add the value in the beginning of the linked List
        System.out.println(list2);
        list2.addLast(324); // add the value at last in linked list
        System.out.println(list2);
        list2.removeFirst();
        System.out.println(list2);
        list2.removeLast();
        System.out.println(list2);

        list2.add(23);
        list2.addLast(22);
        list2.add(234);
        System.out.println(list2);
        System.out.println(list2.getFirst());
        System.out.println(list2.getLast());
        System.out.println(list2.getClass());
        System.out.println(list2.peek());   // returns first element
        System.out.println(list2.poll()); //  return and remove first element
        System.out.println(list2);
        System.out.println(list2.offer(1335));// add value and rerun true
        System.out.println(list2);





    }
}
