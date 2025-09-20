import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // variable declarations
        int customerAge = 0;

        // input
        System.out.println("Please enter your age: ");
        customerAge = in.nextInt();

        if (customerAge >= 21) {
            System.out.println("You are 21 or older, you get a wrist band!");
        }
        else {
            System.out.println("Invalid age!");
        }
    }
}