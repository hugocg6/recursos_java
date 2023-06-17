public class Application {
    public static void main(String[] args) {

        Computer computer1 = new Computer();
        computer1.start();
        computer1.displayInfo();

        Vehicle vehicle1 = new Vehicle("car");
        vehicle1.drive();
        vehicle1.displayInfo();

        Information info = new Computer();
        info.displayInfo();

        Information info1 = vehicle1;
        info1.displayInfo();

        System.out.println();

        showInformation(computer1);
        showInformation(vehicle1);
    }

    private static void showInformation(Information info){
        info.displayInfo();
    }
}
