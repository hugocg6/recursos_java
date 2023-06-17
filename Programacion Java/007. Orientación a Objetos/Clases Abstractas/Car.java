public class Car extends Vehicle{
    @Override
    public void drive() {
        System.out.println("I'm driving a car with " + getEngine() + " engine");
    }
}
