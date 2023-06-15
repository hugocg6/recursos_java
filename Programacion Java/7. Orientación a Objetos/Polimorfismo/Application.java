public class Application {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        Car car = new Car();

        Vehicle vehicle2 = car;

        vehicle1.design();
        vehicle2.design();
        car.ride();
        //vehicle2.ride();

        createDesign(car);
    }
    public static void createDesign(Vehicle vehicle){
        vehicle.design();
    }
}
