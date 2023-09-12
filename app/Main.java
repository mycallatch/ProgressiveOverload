package app;
import java.util.Scanner;

public class Main {

    private static double proteinIntake;
    private static double caloricIntake;
    private static double carbIntake;
    private static double fatIntake;
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

        System.out.println("Were you born male or female? (m/f) ");
        String sex = user.nextLine();

        System.out.println("Are you aiming to recompose, bulk or cut? (r/b/c) ");
        String goal = user.nextLine();

        System.out.println("How active are you? (1-5) ");
        String activityLevel = user.nextLine();

        MacroCalc protein = new MacroCalc();
        proteinIntake = protein.proteinIn(weightInt, goal);
        MacroCalc calories = new MacroCalc();
        caloricIntake = calories.caloriesIn(weightInt, heightInt, ageInt, sex, activityLevel, goal);
        MacroCalc carbohydrates = new MacroCalc();
        carbIntake = carbohydrates.carbsIn(caloricIntake);
        MacroCalc fats = new MacroCalc();
        fatIntake = fats.fatsIn(caloricIntake);

        System.out.println("You should have " + caloricIntake + " calories per day at rest.");
        System.out.println("You should have at least " + proteinIntake + "g of protein per day.");
        System.out.println("You should have at least " + carbIntake + "g of carbs per day");
        System.out.println("You should have at least " + fatIntake + "g of fats per day");
    }
}

