import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application {
    public static void main(String[] args) {

        //HashSet<String> test = new HashSet<>();
        //LinkedHashSet<String> test = new LinkedHashSet<>(); //Input order
        TreeSet<String> test = new TreeSet<>(); //Alphabetical

        if(test.isEmpty()){
            System.out.println("Empty");
        }

        test.add("red");
        test.add("blue");
        test.add("green");
        test.add("black");
        test.add("white");
        test.add("green");

        if(test.isEmpty()){
            System.out.println("Empty");
        }

        System.out.println(test);

        test.forEach(System.out :: println);

        if(test.contains("purple")){
            System.out.println("Contains purple");
        }
        if(test.contains("blue")){
            System.out.println("Contains blue");
        }

        TreeSet<String> test1 = new TreeSet<>();

        test1.add("red");
        test1.add("blue");
        test1.add("green");
        test1.add("black");
        test1.add("white");
        test1.add("green");
        test1.add("beige");
        test1.add("purple");

        HashSet<String> commonItems = new HashSet<>(test);
        commonItems.retainAll(test1);
        System.out.println(commonItems);

        HashSet<String> diffItems = new HashSet<>(test1);
        diffItems.removeAll(test);
        System.out.println(diffItems);
    }
}
