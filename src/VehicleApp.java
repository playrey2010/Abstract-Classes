public class VehicleApp {
    public static void main(String[] args) {
        Plane p = new Plane();
        p.run();
        p.accelerate();
        p.fly();
        p.stop();

        Boat b = new Boat();
        b.run();
        b.accelerate();
        b.sail();
        b.stop();

        Car c = new Car();
        c.run();
        c.accelerate();
        c.honk();
        c.stop();
    }
}
