package Strings;

public class stringEquals {
    public static void main(String[] args) {
        /*
        when we check equality there are three way in java each having diff. meaning
        1.   ==  ->  it checks for reference equality only. checks reference b/w two strings not their content.
        2.  .equals()  ->   it checks/compares the content equality only. means compares content present inside the variables not the reference and the case b/w two strings. if both have same content but diff case it results in false.  CaseSensitive

        3.  .equalsIgnoreCase()     ->   it is similar to .equals() only diff is it is Case Insensitive; does not compares case.
         */

        // now check these examples

            String name1 = "Raj";
            String name2 = "Raj";
//            String name3 = new String("Raj");
            String name3 = new String("RAJ");
            // case 1:
            if(name1 == name2)
                System.out.println("name 1 and name 2 true");
            else
                System.out.println("false");

            // case 1.1:
            if(name1 == name3)
                System.out.println("name 1 and name 2 true");
            else
                System.out.println("false case 1.1");   // string content is same but it says false see. == checks reference  where both have (name1 and name3) diff reference. name1 reference is inside "string constant pool" of the (heap memory) and the name3 reference is outside of "string constant pool" of the (heap memory).

            //  case 2:
            if(name1.equals(name2))
                System.out.println("name 1 and name 2 true of case 2");
            else
                System.out.println("false case 2");
            // case 2.1:
            if(name1.equals(name3))
                System.out.println("name 1 and name 2 true of case 2");
            else
                System.out.println("false case 2.1");   // case 2.1 fails becuze of Capital case.
            // to handel capitale case see third case;

//          case 3

            if(name1.equalsIgnoreCase(name2))
                System.out.println("name 1 and name 2 true of case 2 case 3");
            else
                System.out.println("false case 2");
            // case 3.1:
            if(name1.equalsIgnoreCase(name3))
                System.out.println("name 1 and name 2 true of case 3");
            else
                System.out.println("false case 3.1");
            // it passed becuze it ignors the case of the word




    }
}
