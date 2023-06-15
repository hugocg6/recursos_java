import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        sortedMaps(treeMap);
    }

    public static void sortedMaps(Map<Integer, String> map){

        map.put(4, "Ice Cream");
        map.put(8, "Pizza");
        map.put(0, "Fries");
        map.put(14, "Hot Dog");

        for(Integer numbers: map.keySet()){

            String food = map.get(numbers);

            System.out.println(numbers+food);
        }
    }
}
