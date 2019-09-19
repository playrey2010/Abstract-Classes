public class Car extends Vehicle {
    public void honk() {
        System.out.println("The car is honking.");
    }

    @Override
    public void run() {
        System.out.println("The car is running. ");
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped. ");
    }

    @Override
    public void accelerate() {
        System.out.println("The car is accelerating. ");
    }
}
