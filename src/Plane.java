public class Plane extends Vehicle {

    public void fly() {
        System.out.println("A plane flies.");
    }
    @Override
    public void run() {
        System.out.println("A plane runs. ");
    }

    @Override
    public void stop() {
        System.out.println("A plane stops. ");
    }

    @Override
    public void accelerate() {
        System.out.println("A plane accelerates. ");
    }
}
