package app;

public class MacroCalc {
    float weight;
    float calories;
    float height;
    float age;
    String sex;
    String goal;
    String activityLevel;
    private double fatIntake;
    private double carbIntake;
    private double proteinIntake;
    private double caloricIntake;
    private double BMR;

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
     
    //Takes height, weight, age and gender to calculate user's Base Metabolic Rate or BMR.
    public double BMR(float weight, float height, float age, String sex) {
        MacroCalc body = new MacroCalc();
        if (sex.equals("m")) {
            body.BMR = 10 * weight + 6.25 * height - 5 * age + 5;
        } else if (sex.equals("f")) {
            body.BMR = 10 * weight + 6.25 * height - 5 * age - 161;
        } else {
            System.out.print("Error: please choose m or f");
        }
        return body.BMR;
    }

    //Uses the user's BMR to calculate thier daily caloric burn based on activity levels.
    public double caloriesIn(float weight, float height, float age, String sex, String activityLevel, String goal) {
        MacroCalc body = new MacroCalc();
        if (activityLevel.equals("1")) {
            body.caloricIntake = BMR(weight, height, age, sex) * 1.2;
        } else if (activityLevel.equals("2")) {
            body.caloricIntake = BMR(weight, height, age, sex) * 1.375;
        } else if (activityLevel.equals("3")) {
            body.caloricIntake = BMR(weight, height, age, sex) * 1.55;
        } else if (activityLevel.equals("4")) {
            body.caloricIntake = BMR(weight, height, age, sex) * 1.725;
        } else if (activityLevel.equals("5")) {
            body.caloricIntake = BMR(weight, height, age, sex) * 1.9;
        } else if (activityLevel.equals("0")) {
            body.caloricIntake = BMR(weight, height, age, sex);
        } else {
            System.out.println("Please select an option from 1-5 ");
        }

        //Alters caloric intake if the user is cutting or bulking.
        if (goal.equals("b")) {
            body.caloricIntake += 500; 
        } else if (goal.equals("c")) {
            body.caloricIntake -= 500;
        }

        return Math.round(body.caloricIntake);
    }
        

    //Uses the user's weight to calculate protein intake in grams.
    public double proteinIn(float weight, String goal) {
        MacroCalc body = new MacroCalc();
        if (goal.equals("m")) {
            body.proteinIntake = weight * 1.6;
        } else if (goal.equals("b")) {
            body.proteinIntake = weight * 1.6;
        } else if (goal.equals("c")) {
            body.proteinIntake = weight * 1.8;
        } else {
            System.out.println("Please select an option from m/b/c");
        }
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
