package OOPS_Inheritance.Transport;

public class main {
    public static void main(String[] args) {
        Car c = new Car("Maruti", "800", 4,4, "Auto");
        c.start_engine();
        c.startAC();
        c.stop_engine();

        Motorcycle m = new Motorcycle("Pulsar","150 dts neon",2,"U","smooth");
        m.start_engine();
        m.wheelie();
        m.stop_engine();

    }
}
