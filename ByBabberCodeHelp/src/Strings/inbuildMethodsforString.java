package Strings;

import java.util.Locale;

public class inbuildMethodsforString {

    public static void main(String[] args) {
        String s = "Rahul";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.substring(2));
        System.out.println(s.substring(2,4));


        System.out.println();
        String name = "My name is Rahul kumar";
        // .contains return boolean value if the string is presnet in it.
        System.out.println(name.contains("My"));
        System.out.println(name.contains("my"));    // case Sensitve
        System.out.println(name.contains("abc"));

        System.out.println();

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println();
        // trinming
        String name_2 = "      Rahul    ";
        System.out.println(name_2);     // print with the spaces
        System.out.println(name_2.trim());

        System.out.println();

        // using SPLIT

        String  sententce = "My - name-is-Rahul-And-i-live-in-home ";
        String  []splitted = sententce.split("-");   // spilts on the basisc provided here like " - " (hyphen)
        for(String i:splitted)
            System.out.println(i);

        System.out.println();
        String  sententce1 = "My  -name is Rahul- home";
        String  []splitted1 = sententce1.split(" ");   // spilts on the basisc provided here like " " (space)
        for(String i:splitted1)
            System.out.println(i);  // see it is not spiltting the one hyphen part. only splits the spaces
//        we can use commas or anythiing

        System.out.println();
        System.out.println(sententce1.startsWith("My"));
        System.out.println(sententce1.endsWith("home ")); // false becuze of sapce written here


        System.out.println();
        // converting INT into String
        int num = 12345;
        String st = String.valueOf(num);
        System.out.println(st);
        System.out.println(num+1);  // addition
        System.out.println(st+1);   // concatenation

        System.out.println();

        // changing the character from the string
        String myname = "Rahul";
        String newName = myname.replace('h','k');
        System.out.println(newName);

        System.out.println();

        // printing the chars from the array
        String fullSen = "THis is the example of each char spliting";
        char []ch = fullSen.toCharArray();
        for (char c:ch)
            System.out.println(c);

        // checking isEmpty()
        System.out.println(fullSen.isEmpty());
        String nn = " ";
        System.out.println(nn.isEmpty());      // it taking space as non empty
        String nn1 = "";
        System.out.println(nn1.isEmpty());
        //  isBlanck()  (it doesnt look for space only for char) see for understanding
        System.out.println(nn.isBlank());   // space is there but it says true
        System.out.println(fullSen.isBlank());
        // see the diff b/w isEmpty() and isBlank()


    }

}
