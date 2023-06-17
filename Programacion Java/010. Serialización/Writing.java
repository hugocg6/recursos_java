import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Writing {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        Vehicle[] vehicle = {new Vehicle(805,"Toyota"),
        new Vehicle(505, "Ford"), new Vehicle(203,"Chevrolet")};

        List<Vehicle> vehicleList = new ArrayList<>(Arrays.asList(vehicle));

        try(FileOutputStream fileOutput = new FileOutputStream("vehicle.data")){

            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

            objectOutput.writeObject(vehicle);
            objectOutput.writeObject(vehicleList);

            objectOutput.writeInt(vehicleList.size());

            vehicleList.forEach(v -> {
                try {
                    objectOutput.writeObject(v);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            objectOutput.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
