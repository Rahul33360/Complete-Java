package CollectionFramework_2;

import java.util.*;


public class myQueue {

    public static void main(String[] args) {

        Queue<String> animal = new LinkedList<>();
///        we can implement Queue using thse two also
//        Queue<Integer> abc = new ArrayDeque<>(); // -> doubly ended Queue
//        <Integer> ab = new PriorityQueue<>();
//        In place of this Queue<Integer> we can use some other inbuilt implementation too  Deque<Integer>

        // let's try Queue using LinkedList
        animal.add("dog");
        animal.add("cat");
        animal.add("cow");
        animal.add("Tiger");
        System.out.println(animal);
        System.out.println(animal.peek());
        System.out.println(animal.element()); // it also returns first element
        System.out.println(animal.remove());
        System.out.println(animal.poll());  // it also removes element
        animal.offer("Lion"); // adds element like .add method.
        System.out.println(animal);






    }

}
