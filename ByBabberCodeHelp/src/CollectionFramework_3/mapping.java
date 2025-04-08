package CollectionFramework_3;

import java.util.*;

public class mapping {
    public static void main(String[] args) {

        Map<String,String> mp = new HashMap<>();
//        in place of HashMap we can write LinkedHashMap<>(); and aur bhi hai not only this
        mp.put("in","India");
        mp.put("ussr", "Russia");
        mp.put("us", "United States");
        mp.put("br", "brazil");
        System.out.println(mp);
        mp.put("in","India2");  // see here if key is same and if u put diff value then the previous values updated with new one
        System.out.println(mp);

        System.out.println(); // new line
        Map<String,String> table = new HashMap<>();
        table.put("nz", "New Zealand");
        table.put("ca", "Canada");
        table.put("au","Australia");
        table.put("be","Belgium");
        System.out.println(table);
        System.out.println(table.size());

        mp.putAll(table);   // put all the values in mp map from table
        System.out.println(mp);

        table.remove("ca");
        System.out.println(table);
//        table.clear();
//        System.out.println(table);
        System.out.println(table.get("au"));// return values to respective of key

        // it insert the value if not present respective of its key for example below
        table.put("in", "india");
        table.putIfAbsent("in", "india2");  // if value is not present with reference to key then it inserts the values
        System.out.println(table.get("in"));

//        checking key present of not

        System.out.println(table.containsKey("ca"));
        System.out.println(table.containsKey("nz"));
//      checking value present or not
        System.out.println(table.containsValue("Canada"));
        System.out.println(table.containsValue("New Zealand"));

//        checks wether value present or not . If not it returns the value if not  then it return then default value what ever you putted. for ex-
        System.out.println(table.getOrDefault("en","Not Found"));
        System.out.println(table.getOrDefault("ca","None"));
        table.replace("nz","ABCC");
        System.out.println(table);

///        if we want to print keys or only values then
///        table.keySet(); // now to press ctrl button and put the cursor then click and check the return type of this value in order to store it. like below
//        for key
        Set<String> variable_name = table.keySet();
        System.out.println(variable_name);
//        for values
        Collection<String> var_name_2 = table.values();
//        these word collection and the set word comes when you check the type when you press ctrl and cursor then click
        System.out.println(var_name_2);





    }
}
