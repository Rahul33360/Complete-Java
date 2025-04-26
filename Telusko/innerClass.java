//      A class inside a class


class ABS {
    int age = 3;
    public void show() {
        System.out.println("in show");
    }
    /*
    class BSS {
        public void config() {
            System.out.println("in config");
        }
    }
    */
    static class BSS {
        public void config() {
            System.out.println("in config");
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        ABS obj = new ABS();
        obj.show();
   //   but if we want to call class which present inside class. we need to call it via the help of class ABS
        //ABS.BSS obj1 = obj.new BSS();
        //obj1.config();
//   or we can call it independently by using static keyword before class BSS.
//   Only class 's  members can be marked as static or the class present inside the class.
//   ( not the outermost class should be mention with static )
//   only static class can be called without object creation.
        ABS.BSS obj1 = new ABS.BSS();
        obj1.config();

    }
}