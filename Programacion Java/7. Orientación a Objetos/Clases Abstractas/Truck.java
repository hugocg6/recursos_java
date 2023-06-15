public class Truck extends Vehicle{

    @Override
    public void drive() {
        System.out.println("I'm driving a truck with " + getEngine() + " engine");
    }
}
