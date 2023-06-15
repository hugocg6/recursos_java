import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        values.add(20);
        values.add(60);
        values.add(200);

        System.out.println(values.get(2));

        values.forEach(System.out :: println);

    }
}
