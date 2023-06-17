import java.util.Scanner;

public class User_Input_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        do {
            System.out.println("Enter a number: ");
            n = input.nextInt();
        }
        while (n != 9);
        System.out.println("You got 9");
    }
}
