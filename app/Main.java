package app;
import java.util.Scanner;

public class Main {

    private static double intake;
    private static float weightInt;
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("How heavy are you in kg? ");
        String weight = user.nextLine();
        weightInt = Integer.parseInt(weight);
        MacroCalc protein = new MacroCalc();
        intake = protein.proteinIn(weightInt);

        System.out.println("You should have at least " + intake + "g of protein per day");
    }
}

