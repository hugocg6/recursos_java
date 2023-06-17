class Methods{
    int month;

    int calculateMonthsToBirthday(){
        int monthsLeft = 12 - month;
        return monthsLeft;
    }

    void talk(String text){
        System.out.println(text);
    }

    void walk(int speed){
        System.out.println("Walking at " + speed + " km per hour");
    }

    void timer(int minutes, double seconds){
        System.out.println("It took " + minutes + " minutes and " + seconds + " to run up that hill");
    }
}

public class ReturnTypes {
    public static void main(String[] args) {
        Methods name = new Methods();
        name.month = 8;
        int months = name.calculateMonthsToBirthday();

        System.out.println(months + " months until birthday");

        name.talk("Hi, I am Hugo");

        name.walk(7);
        name.timer(8, 3.56);
    }
}
