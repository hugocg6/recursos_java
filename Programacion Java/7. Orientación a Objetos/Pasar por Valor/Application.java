public class Application {
    public static void main(String[] args) {

        Application app = new Application();

        int number = 10;
        app.display(number);

        Cat cat = new Cat("Arya");

        app.display(cat);
        System.out.println(cat);
    }

    public void display(int number){
        System.out.println(number);
        number = 15;
        System.out.println(number);
    }

    public void display(Cat cat){
        System.out.println(cat);

        cat.setName("Sansa");
        System.out.println(cat);
    }

}
