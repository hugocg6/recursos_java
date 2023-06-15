import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Reading {
    public static void main(String[] args) {
        System.out.println("Reading objects...");
        System.out.println("-----------------------------------");

        try(FileInputStream fileInput = new FileInputStream("vehicle.data")){

            ObjectInputStream objectInput = new ObjectInputStream(fileInput);

            Vehicle[] vehicle = (Vehicle[]) objectInput.readObject();
            List<Vehicle> vehicleList = (ArrayList)objectInput.readObject();

            for(Vehicle myVehicle : vehicle)
                System.out.println(myVehicle);

            System.out.println("-----------------------------------");

            vehicleList.forEach(System.out :: println);

            System.out.println("-----------------------------------");

            int value = objectInput.readInt();

            for (int i=0; i<value;i++){
                Vehicle vehicles = (Vehicle) objectInput.readObject();
                System.out.println(vehicles);
            }

            objectInput.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
