import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {

        //The following code scans input from keyboard

        Scanner input = new Scanner(System.in);
        System.out.println("Enter text: ");

        if(input.hasNextLine()){
            String text = input.nextLine();
            System.out.println("Your text: "+text);
        }else if (input.hasNextInt()){
            int aValue = input.nextInt();
            System.out.println("Your number: "+aValue);
        }else{
            double aDouble = input.nextDouble();
            System.out.println("Your double: "+aDouble);
        }
    }
}
