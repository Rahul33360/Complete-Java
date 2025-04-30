//  A enum is class but it cannot be extended by any class;

enum Laptop {
    HP(12345),Lenovo(50000), Surface(23130),Intel(210000);
    private int price;
    private Laptop(int price ) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class morewithEnum {
    public static void main(String[] args) {

//        Laptop lapi = Laptop.HP;
//        System.out.println(lapi +" : " + lapi.getPrice() );
//        lapi.setPrice(100000);
//        System.out.println(lapi +" : " + lapi.getPrice() );
        for(Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }

    }
}
