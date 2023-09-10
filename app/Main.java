package app;
import java.util.Scanner;

public class Main {

    private static double proteinIntake;
    private static double caloricIntake;
    private static float weightInt;
    private static float heightInt;
    private static float ageInt;

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("How heavy are you in kg? ");
        String weight = user.nextLine();
        weightInt = Integer.parseInt(weight);
        System.out.println("How tall are you in cm? ");
        String height = user.nextLine();
        heightInt = Integer.parseInt(height);
        System.out.println("How old are you in years? ");
        String age = user.nextLine();
        ageInt = Integer.parseInt(age);
        MacroCalc protein = new MacroCalc();
        proteinIntake = protein.proteinIn(weightInt);
        MacroCalc calories = new MacroCalc();
        caloricIntake = calories.caloriesIn(weightInt, heightInt, ageInt);

        System.out.println("You should have " + caloricIntake + " calories per day at rest.");
        System.out.println("You should have at least " + proteinIntake + "g of protein per day.");
    }
}

