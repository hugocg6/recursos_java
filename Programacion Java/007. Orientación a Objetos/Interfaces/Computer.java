public class Computer implements Information{

    private int serialNumber = 8953;

    public void start(){
        System.out.println("Computer started");
    }

    @Override
    public void displayInfo() {
        System.out.println("Computer serial number is " + serialNumber);
    }
}
