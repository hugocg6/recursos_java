import java.util.Objects;

class Laptop{
    private int id;
    private String brand;

    public Laptop(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return id == laptop.id && Objects.equals(brand, laptop.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand);
    }
}

public class Application {
    public static void main(String[] args) {

        System.out.println(new Object());

        Laptop laptop1 = new Laptop(250,"HP");
        Laptop laptop2 = new Laptop(350,"Dell");

        System.out.println(laptop1.equals(laptop2));

        int firstNumber = 8;
        int secondNumber = 8;

        System.out.println(firstNumber == secondNumber);

        String a = "Yes";
        String b = "Yeseees".substring(0,3);

        System.out.println(a.equals(b));
        System.out.println(b);
    }
}
