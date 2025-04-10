
class abc {
    static public int ac = 890;
    public int val =13;
}
public class strBuffer {
    public static void main(String[] args) {    // a brain stroking thought -> why this main method in this class strBuffer is static. WHY ???
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        StringBuffer str = new StringBuffer("Rahul");
        System.out.println(str);
        System.out.println(str.length());
        str.append(" kumar ");
        System.out.println(str);
        str.insert(12, "Learning Java");
        System.out.println(str);
        System.out.println(str.capacity());
//        abc a = new abc();
        System.out.println(abc.ac); // we can access this static without creating its object
//        System.out.println(val);  // but this will so error   -> to access this class property , create an object
        abc a = new abc();
        System.out.println(a.val);
    }
}
