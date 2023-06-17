import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //switch supports char, byte, int, short and String

        System.out.println("Enter your instructions: ");
        String text = input.nextLine();

        switch (text){
            case "run":
                System.out.println("Program is running");
                break;
            case "stop":
                System.out.println("Program stopped");
                break;
            default:
                System.out.println("Instruction not recognized");
        }
    }
}
