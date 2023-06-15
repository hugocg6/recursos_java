import java.io.Serializable;

public class Vehicle implements Serializable {
    private int sn;
    private String brand;

    public Vehicle(int sn, String brand) {
        this.sn = sn;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicle [serialNumber=" +sn+", brand="+brand+"]";
    }
}

