package app;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner user = new Scanner(System.in)) {
            System.out.println("How heavy are you in kg? ");

            String intake = user.nextLine();
            System.out.println("You should have " + intake + "g of protein per day");
        }
    }
}
