public class Boat extends Vehicle {

    public void sail() {
        System.out.println("The boat is sailing. ");
    }

    @Override
    public void run() {
        System.out.println("The boat runs.");
    }

    @Override
    public void stop() {
        System.out.println("The boat stops. ");
    }

    @Override
    public void accelerate() {
        System.out.println("The boat accelerates. ");
    }
}
