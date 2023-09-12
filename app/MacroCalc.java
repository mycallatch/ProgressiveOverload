package app;

public class MacroCalc {
    float weight;
    float calories;
    float height;
    float age;
    String sex;
    String goal;
    private double fatIntake;
    private double carbIntake;
    private double proteinIntake;
    private double caloricIntake;

    //Constructor
    public MacroCalc() {
        weight = 0;
        height = 0;
        age = 0;
        sex = "";
        goal = "";
        calories = 0;
        caloricIntake = 0;
        proteinIntake = 0;
        caloricIntake = 0;
    }
     
    //Takes height, weight, age and gender to calculate user's caloric burn
    public double caloriesIn(float weight, float height, float age, String sex) {
        MacroCalc body = new MacroCalc();
        if (sex.equals("m")) {
            body.caloricIntake = 10 * weight + 6.25 * height - 5 * age + 5;
        } else if (sex.equals("f")) {
            body.caloricIntake = 10 * weight + 6.25 * height - 5 * age - 161;
        } else {
            System.out.print("Error: please choose m or f");
        }
        return Math.round(body.caloricIntake);
    }

    //Uses the user's weight to calculate protein intake in grams.
    public double proteinIn(float weight, String goal) {
        MacroCalc body = new MacroCalc();
        if (goal.equals("r")) {
            body.proteinIntake = weight * 1.6;
            System.out.println(proteinIntake);
        } else if (goal.equals("b")) {
            body.proteinIntake = weight * 1.6;
            System.out.println(proteinIntake);
        } else if (goal.equals("c")) {
            body.proteinIntake = weight * 1.8;
            System.out.println(proteinIntake);
        } else {
            System.out.println("Please select an option from r/b/c");
        }
        System.out.println(proteinIntake);
        return Math.round(body.proteinIntake);
    }

    //Uses user's caloric intake to calculate ideal carb intake in g.
    //Half of the user's calories should come from carbs, 1g of carbs is made up of 4 calories.
    public double carbsIn(double caloricIntake) {
        MacroCalc body = new MacroCalc();
        body.carbIntake = (caloricIntake * 0.5) / 4;
        return Math.round(body.carbIntake);
    }

    //Uses user's caloric intake to calculate ideal fat intake in g.
    //30% of the user's calories should come from fats, 1g of fats is made up of 9 calories.
    public double fatsIn( double caloricIntake) {
         MacroCalc body = new MacroCalc();
        body.fatIntake = (caloricIntake * 0.3) / 9;
        return Math.round(body.fatIntake);
    }
}
