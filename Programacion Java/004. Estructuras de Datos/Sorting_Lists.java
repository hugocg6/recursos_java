import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortStringLenght implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {

        int strLength1 = o1.length();
        int strLength2 = o2.length();

        if(strLength1 > strLength2){
            return 1;
        } else if (strLength1 < strLength2) {
            return -1;
        }else
            return 0;
    }
}

class SortInReverseAlphabeticalOrder implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}

public class Application {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("green");
        colors.add("purple");
        colors.add("red");
        colors.add("blue");
        colors.add("black");

        Collections.sort(colors, new SortInReverseAlphabeticalOrder());

        colors.forEach(System.out::println);

        List<Integer> values = new ArrayList<>();

        values.add(12);
        values.add(32);
        values.add(56);
        values.add(9);
        values.add(2);

        Collections.sort(values, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });

        values.forEach(System.out::println);
    }
}
