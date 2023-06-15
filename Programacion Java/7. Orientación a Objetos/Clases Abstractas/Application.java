public class Application {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setEngine("hybrid");
        car1.drive();

        Truck truck1 = new Truck();

        truck1.setEngine("electric");
        truck1.drive();

    }
}
