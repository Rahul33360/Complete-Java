package Collection;
import java.util.HashMap;
import java.util.Hashtable;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("Rahul", 1);
        mp.put("Kumar", 26);
        mp.put("Rahul", 33);
        mp.put("Saturday", 51);
        mp.put("Patrik", 31);
        mp.put("Robert", 71);
//  put vs add - add means simply add value. but put means if value present to that variable/key just update it.
        //  that why  we have put in Map

        System.out.println(mp);

        System.out.println();

        for(String key:mp.keySet() )
            System.out.println(key + " : " + mp.get(key) );

/// We have Hashtable also. Which is almost the same functionality to Map. But One diff. Is Hashtable is synchronized inbuild.
///     Remember about it "synchronized" we studied it in Threads. While create in Threads.
//      For Hashtable creation we write
//        Hashtable<String , Integer> table = new Hashtable<>();    // just Hashtable in Place of Map.



    }
}
