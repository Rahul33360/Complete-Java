/**
 * Guess The Output of the Program
*/

class book {
    int price;
    String name;
    void display() {
        System.out.println("Name : " +name+  "\n" + "Price : "+ price + "\n");
    }
}

class  stationary extends book {

}

public class some_inheritance_tries {
    public static void main(String[] args) {
        book b = new book();
        b.name = "Harry Potter";
        b.price = 20;
        b.display();

        stationary s = new stationary();
        s.display();

    }
}
