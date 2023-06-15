import java.io.IOException;
import java.text.ParseException;

public class Application {
    public static void main(String[] args) {

        MultipleExceptions me = new MultipleExceptions();

        /*try {
            me.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            System.out.println("Incorrect Format");
        }*/

        /*try {
            me.start();
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }*/

        try {
            me.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            me.example();
        } catch (IOException e) {   //File not found es subclase de IO
            throw new RuntimeException(e);
        }
    }
}
