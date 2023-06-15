interface FunctionalInterface{
    int start(int value, int value1);
}

interface AnotherFunctionalInterface{
    int start(String value);
}

class Car {

    public void drive(FunctionalInterface obj){
        System.out.println("Driving the car...");
        int number = obj.start(18, 20);
        System.out.println(number);
    }

    /*public void drive(AnotherFunctionalInterface obj){
        System.out.println("Driving the car...");
        int number = obj.start("Hello there");
        System.out.println(number);
    }*/
}

public class Application {
    public static void main(String[] args) {

        Car car = new Car();

        //Anonymous class
        car.drive(new FunctionalInterface() {
            public int start(int value, int value1) {
                System.out.println("Start driving...");
                return value1 * value;
            }
        });
        System.out.println();

        //Lambda expression

        car.drive((value, value1) -> {
            System.out.println("Start driving...");
            return value1 * value;
        });
    }
}
