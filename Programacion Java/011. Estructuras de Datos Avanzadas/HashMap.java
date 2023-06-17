import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(3, "Cat");
        map.put(1, "Dog");
        map.put(2, "Tiger");

        String animal = map.get(3);
        System.out.println(animal);

        for(Map.Entry<Integer, String> myAnimals: map.entrySet()){
            int key = myAnimals.getKey();
            String value = myAnimals.getValue();

            System.out.println(key + value);
        }
    }
}
